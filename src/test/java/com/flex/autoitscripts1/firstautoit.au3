AutoItSetOption("WinTitleMatchMode","2")
$userName="flex"
$pressTab="{TAB}";
$password="inthebox"
$pressEnter="{Enter}"
;$winIETitle="Windows Security"
$winChomeTitle="https://www.stagemvpmaster.com - Google Chrome"
If WinExists($winChomeTitle) Then
	ConsoleWrite("Inside CHROME Browser: " & $winChomeTitle & @CRLF)
	WinActivate($winChomeTitle, "")
	WinWaitActive($winChomeTitle,"","2")
	Sleep(5)
	Send($userName)
	Send($pressTab)
	Send($password)
	Send($pressEnter)
	Sleep(5)
Else
	ConsoleWrite("CHROME Login Window is NOT present" & @CRLF)
EndIf

