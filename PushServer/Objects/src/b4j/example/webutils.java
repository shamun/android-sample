package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class webutils extends Object{
public static webutils mostCurrent = new webutils();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.StandardBA("b4j.example", "b4j.example.webutils", null);
		ba.loadHtSubs(webutils.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "b4j.example.webutils", ba);
		}
	}
    public static Class<?> getObject() {
		return webutils.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4a.agraham.byteconverter.ByteConverter _bc = null;
public static b4j.example.main _main = null;
public static b4j.example.iosfeedback _iosfeedback = null;
public static b4j.example.iospush _iospush = null;
public static b4j.example.httputils2service _httputils2service = null;
public static b4j.example.androidpush _androidpush = null;
public static b4j.example.dbutils _dbutils = null;
public static String  _escapehtml(String _raw) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
char _c = '\0';
 //BA.debugLineNum = 10;BA.debugLine="Public Sub EscapeHtml(Raw As String) As String";
 //BA.debugLineNum = 11;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 12;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 13;BA.debugLine="For i = 0 To Raw.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_raw.length()-1);
_i = (int) (0) ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
 //BA.debugLineNum = 14;BA.debugLine="Dim C As Char = Raw.CharAt(i)";
_c = _raw.charAt(_i);
 //BA.debugLineNum = 15;BA.debugLine="Select C";
switch (BA.switchObjectToInt(_c,BA.ObjectToChar(anywheresoftware.b4a.keywords.Common.QUOTE),BA.ObjectToChar("'"),BA.ObjectToChar("<"),BA.ObjectToChar(">"),BA.ObjectToChar("&"))) {
case 0: {
 //BA.debugLineNum = 17;BA.debugLine="sb.Append(\"&quot;\")";
_sb.Append("&quot;");
 break; }
case 1: {
 //BA.debugLineNum = 19;BA.debugLine="sb.Append(\"&#39;\")";
_sb.Append("&#39;");
 break; }
case 2: {
 //BA.debugLineNum = 21;BA.debugLine="sb.Append(\"&lt;\")";
_sb.Append("&lt;");
 break; }
case 3: {
 //BA.debugLineNum = 23;BA.debugLine="sb.Append(\"&gt;\")";
_sb.Append("&gt;");
 break; }
case 4: {
 //BA.debugLineNum = 25;BA.debugLine="sb.Append(\"&amp;\")";
_sb.Append("&amp;");
 break; }
default: {
 //BA.debugLineNum = 27;BA.debugLine="sb.Append(C)";
_sb.Append(BA.ObjectToString(_c));
 break; }
}
;
 }
};
 //BA.debugLineNum = 30;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return "";
}
public static String  _init() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Public Sub init";
 //BA.debugLineNum = 7;BA.debugLine="bc.LittleEndian = True";
_bc.setLittleEndian(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public bc As ByteConverter";
_bc = new anywheresoftware.b4a.agraham.byteconverter.ByteConverter();
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return "";
}
public static byte[]  _readbytesfromstream(anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in,int _length) throws Exception{
byte[] _b = null;
int _count = 0;
int _read = 0;
 //BA.debugLineNum = 65;BA.debugLine="Sub ReadBytesFromStream(In As InputStream, Length";
 //BA.debugLineNum = 66;BA.debugLine="If Length > 5000 Then";
if (_length>5000) { 
 //BA.debugLineNum = 67;BA.debugLine="Log(\"Error reading from stream\")";
anywheresoftware.b4a.keywords.Common.Log("Error reading from stream");
 //BA.debugLineNum = 68;BA.debugLine="Return Null";
if (true) return (byte[])(anywheresoftware.b4a.keywords.Common.Null);
 };
 //BA.debugLineNum = 70;BA.debugLine="Dim b(Length) As Byte";
_b = new byte[_length];
;
 //BA.debugLineNum = 71;BA.debugLine="Dim count As Int = 0";
_count = (int) (0);
 //BA.debugLineNum = 72;BA.debugLine="Do While count < Length";
while (_count<_length) {
 //BA.debugLineNum = 73;BA.debugLine="Dim read As Int = In.ReadBytes(b, count, Length";
_read = _in.ReadBytes(_b,_count,(int) (_length-_count));
 //BA.debugLineNum = 74;BA.debugLine="If read <= 0 Then";
if (_read<=0) { 
 //BA.debugLineNum = 75;BA.debugLine="Log(\"Error reading from stream.\")";
anywheresoftware.b4a.keywords.Common.Log("Error reading from stream.");
 //BA.debugLineNum = 76;BA.debugLine="Return Null";
if (true) return (byte[])(anywheresoftware.b4a.keywords.Common.Null);
 };
 //BA.debugLineNum = 78;BA.debugLine="count = count + read";
_count = (int) (_count+_read);
 }
;
 //BA.debugLineNum = 80;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public static String  _readstring(anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in) throws Exception{
int _len = 0;
 //BA.debugLineNum = 58;BA.debugLine="Public Sub ReadString(In As InputStream) As String";
 //BA.debugLineNum = 59;BA.debugLine="Dim len As Int = bc.IntsFromBytes(ReadBytesFromSt";
_len = _bc.IntsFromBytes(_readbytesfromstream(_in,(int) (4)))[(int) (0)];
 //BA.debugLineNum = 60;BA.debugLine="Return BytesToString(ReadBytesFromStream(In, len)";
if (true) return anywheresoftware.b4a.keywords.Common.BytesToString(_readbytesfromstream(_in,_len),(int) (0),_len,"UTF8");
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return "";
}
public static String  _redirectto(anywheresoftware.b4j.object.WebSocket _ws,String _targeturl) throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Public Sub RedirectTo(ws As WebSocket, TargetUrl A";
 //BA.debugLineNum = 56;BA.debugLine="ws.Eval(\"window.location = arguments[0]\", Array A";
_ws.Eval("window.location = arguments[0]",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_targeturl)}));
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return "";
}
public static String  _replacemap(String _base,anywheresoftware.b4a.objects.collections.Map _replacements) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _pattern = null;
String _k = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _result = null;
int _lastindex = 0;
String _replace = "";
 //BA.debugLineNum = 33;BA.debugLine="Public Sub ReplaceMap(Base As String, Replacements";
 //BA.debugLineNum = 34;BA.debugLine="Dim pattern As StringBuilder";
_pattern = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 35;BA.debugLine="pattern.Initialize";
_pattern.Initialize();
 //BA.debugLineNum = 36;BA.debugLine="For Each k As String In Replacements.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _replacements.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 37;BA.debugLine="If pattern.Length > 0 Then pattern.Append(\"|\")";
if (_pattern.getLength()>0) { 
_pattern.Append("|");};
 //BA.debugLineNum = 38;BA.debugLine="pattern.Append(\"\\$\").Append(k).Append(\"\\$\")";
_pattern.Append("\\$").Append(_k).Append("\\$");
 }
};
 //BA.debugLineNum = 40;BA.debugLine="Dim m As Matcher = Regex.Matcher(pattern.ToString";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher(_pattern.ToString(),_base);
 //BA.debugLineNum = 41;BA.debugLine="Dim result As StringBuilder";
_result = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 42;BA.debugLine="result.Initialize";
_result.Initialize();
 //BA.debugLineNum = 43;BA.debugLine="Dim lastIndex As Int";
_lastindex = 0;
 //BA.debugLineNum = 44;BA.debugLine="Do While m.Find";
while (_m.Find()) {
 //BA.debugLineNum = 45;BA.debugLine="result.Append(Base.SubString2(lastIndex, m.GetSt";
_result.Append(_base.substring(_lastindex,_m.GetStart((int) (0))));
 //BA.debugLineNum = 46;BA.debugLine="Dim replace As String = Replacements.Get(m.Match";
_replace = BA.ObjectToString(_replacements.Get((Object)(_m.getMatch().substring((int) (1),(int) (_m.getMatch().length()-1)))));
 //BA.debugLineNum = 47;BA.debugLine="If m.Match.ToLowerCase.StartsWith(\"$h_\") Then re";
if (_m.getMatch().toLowerCase().startsWith("$h_")) { 
_replace = _escapehtml(_replace);};
 //BA.debugLineNum = 48;BA.debugLine="result.Append(replace)";
_result.Append(_replace);
 //BA.debugLineNum = 49;BA.debugLine="lastIndex = m.GetEnd(0)";
_lastindex = _m.GetEnd((int) (0));
 }
;
 //BA.debugLineNum = 51;BA.debugLine="If lastIndex < Base.Length Then result.Append(Bas";
if (_lastindex<_base.length()) { 
_result.Append(_base.substring(_lastindex));};
 //BA.debugLineNum = 52;BA.debugLine="Return result.ToString";
if (true) return _result.ToString();
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
}
