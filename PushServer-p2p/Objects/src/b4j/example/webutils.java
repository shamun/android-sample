package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.debug.*;

public class webutils extends Object{
public static webutils mostCurrent = new webutils();

public static BA ba;
static {
		ba = new  anywheresoftware.b4a.ShellBA("b4j.example", "b4j.example.webutils", null);
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
public static b4j.example.iospush _iospush = null;
public static b4j.example.iosfeedback _iosfeedback = null;
public static b4j.example.androidpush _androidpush = null;
public static b4j.example.dbutils _dbutils = null;
public static b4j.example.httputils2service _httputils2service = null;
public static String  _escapehtml(String _raw) throws Exception{
RDebugUtils.currentModule="webutils";
if (Debug.shouldDelegate(ba, "escapehtml"))
	return (String) Debug.delegate(ba, "escapehtml", new Object[] {_raw});
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
char _c = '\0';
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Public Sub EscapeHtml(Raw As String) As String";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="For i = 0 To Raw.Length - 1";
{
final int step3 = 1;
final int limit3 = (int) (_raw.length()-1);
_i = (int) (0) ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Dim C As Char = Raw.CharAt(i)";
_c = _raw.charAt(_i);
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="Select C";
switch (BA.switchObjectToInt(_c,BA.ObjectToChar(anywheresoftware.b4a.keywords.Common.QUOTE),BA.ObjectToChar("'"),BA.ObjectToChar("<"),BA.ObjectToChar(">"),BA.ObjectToChar("&"))) {
case 0: {
RDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="sb.Append(\"&quot;\")";
_sb.Append("&quot;");
 break; }
case 1: {
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="sb.Append(\"&#39;\")";
_sb.Append("&#39;");
 break; }
case 2: {
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="sb.Append(\"&lt;\")";
_sb.Append("&lt;");
 break; }
case 3: {
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="sb.Append(\"&gt;\")";
_sb.Append("&gt;");
 break; }
case 4: {
RDebugUtils.currentLine=2097167;
 //BA.debugLineNum = 2097167;BA.debugLine="sb.Append(\"&amp;\")";
_sb.Append("&amp;");
 break; }
default: {
RDebugUtils.currentLine=2097169;
 //BA.debugLineNum = 2097169;BA.debugLine="sb.Append(C)";
_sb.Append(BA.ObjectToString(_c));
 break; }
}
;
 }
};
RDebugUtils.currentLine=2097172;
 //BA.debugLineNum = 2097172;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=2097173;
 //BA.debugLineNum = 2097173;BA.debugLine="End Sub";
return "";
}
public static String  _init() throws Exception{
RDebugUtils.currentModule="webutils";
if (Debug.shouldDelegate(ba, "init"))
	return (String) Debug.delegate(ba, "init", null);
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Public Sub init";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="bc.LittleEndian = True";
_bc.setLittleEndian(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="End Sub";
return "";
}
public static byte[]  _readbytesfromstream(anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in,int _length) throws Exception{
RDebugUtils.currentModule="webutils";
if (Debug.shouldDelegate(ba, "readbytesfromstream"))
	return (byte[]) Debug.delegate(ba, "readbytesfromstream", new Object[] {_in,_length});
byte[] _b = null;
int _count = 0;
int _read = 0;
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub ReadBytesFromStream(In As InputStream, Length";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="If Length > 5000 Then";
if (_length>5000) { 
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="Log(\"Error reading from stream\")";
anywheresoftware.b4a.keywords.Common.Log("Error reading from stream");
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Return Null";
if (true) return (byte[])(anywheresoftware.b4a.keywords.Common.Null);
 };
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="Dim b(Length) As Byte";
_b = new byte[_length];
;
RDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="Dim count As Int = 0";
_count = (int) (0);
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="Do While count < Length";
while (_count<_length) {
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="Dim read As Int = In.ReadBytes(b, count, Length";
_read = _in.ReadBytes(_b,_count,(int) (_length-_count));
RDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="If read <= 0 Then";
if (_read<=0) { 
RDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="Log(\"Error reading from stream.\")";
anywheresoftware.b4a.keywords.Common.Log("Error reading from stream.");
RDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="Return Null";
if (true) return (byte[])(anywheresoftware.b4a.keywords.Common.Null);
 };
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="count = count + read";
_count = (int) (_count+_read);
 }
;
RDebugUtils.currentLine=2359311;
 //BA.debugLineNum = 2359311;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=2359312;
 //BA.debugLineNum = 2359312;BA.debugLine="End Sub";
return null;
}
public static String  _readstring(anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _in) throws Exception{
RDebugUtils.currentModule="webutils";
if (Debug.shouldDelegate(ba, "readstring"))
	return (String) Debug.delegate(ba, "readstring", new Object[] {_in});
int _len = 0;
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Public Sub ReadString(In As InputStream) As String";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="Dim len As Int = bc.IntsFromBytes(ReadBytesFromSt";
_len = _bc.IntsFromBytes(_readbytesfromstream(_in,(int) (4)))[(int) (0)];
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Return BytesToString(ReadBytesFromStream(In, len)";
if (true) return anywheresoftware.b4a.keywords.Common.BytesToString(_readbytesfromstream(_in,_len),(int) (0),_len,"UTF8");
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="End Sub";
return "";
}
public static String  _redirectto(anywheresoftware.b4j.object.WebSocket _ws,String _targeturl) throws Exception{
RDebugUtils.currentModule="webutils";
if (Debug.shouldDelegate(ba, "redirectto"))
	return (String) Debug.delegate(ba, "redirectto", new Object[] {_ws,_targeturl});
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Public Sub RedirectTo(ws As WebSocket, TargetUrl A";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="ws.Eval(\"window.location = arguments[0]\", Array A";
_ws.Eval("window.location = arguments[0]",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_targeturl)}));
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public static String  _replacemap(String _base,anywheresoftware.b4a.objects.collections.Map _replacements) throws Exception{
RDebugUtils.currentModule="webutils";
if (Debug.shouldDelegate(ba, "replacemap"))
	return (String) Debug.delegate(ba, "replacemap", new Object[] {_base,_replacements});
anywheresoftware.b4a.keywords.StringBuilderWrapper _pattern = null;
String _k = "";
anywheresoftware.b4a.keywords.Regex.MatcherWrapper _m = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _result = null;
int _lastindex = 0;
String _replace = "";
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Public Sub ReplaceMap(Base As String, Replacements";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Dim pattern As StringBuilder";
_pattern = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="pattern.Initialize";
_pattern.Initialize();
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="For Each k As String In Replacements.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _replacements.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="If pattern.Length > 0 Then pattern.Append(\"|\")";
if (_pattern.getLength()>0) { 
_pattern.Append("|");};
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="pattern.Append(\"\\$\").Append(k).Append(\"\\$\")";
_pattern.Append("\\$").Append(_k).Append("\\$");
 }
};
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="Dim m As Matcher = Regex.Matcher(pattern.ToString";
_m = new anywheresoftware.b4a.keywords.Regex.MatcherWrapper();
_m = anywheresoftware.b4a.keywords.Common.Regex.Matcher(_pattern.ToString(),_base);
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="Dim result As StringBuilder";
_result = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="result.Initialize";
_result.Initialize();
RDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="Dim lastIndex As Int";
_lastindex = 0;
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="Do While m.Find";
while (_m.Find()) {
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="result.Append(Base.SubString2(lastIndex, m.GetSt";
_result.Append(_base.substring(_lastindex,_m.GetStart((int) (0))));
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="Dim replace As String = Replacements.Get(m.Match";
_replace = BA.ObjectToString(_replacements.Get((Object)(_m.getMatch().substring((int) (1),(int) (_m.getMatch().length()-1)))));
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="If m.Match.ToLowerCase.StartsWith(\"$h_\") Then re";
if (_m.getMatch().toLowerCase().startsWith("$h_")) { 
_replace = _escapehtml(_replace);};
RDebugUtils.currentLine=2162703;
 //BA.debugLineNum = 2162703;BA.debugLine="result.Append(replace)";
_result.Append(_replace);
RDebugUtils.currentLine=2162704;
 //BA.debugLineNum = 2162704;BA.debugLine="lastIndex = m.GetEnd(0)";
_lastindex = _m.GetEnd((int) (0));
 }
;
RDebugUtils.currentLine=2162706;
 //BA.debugLineNum = 2162706;BA.debugLine="If lastIndex < Base.Length Then result.Append(Bas";
if (_lastindex<_base.length()) { 
_result.Append(_base.substring(_lastindex));};
RDebugUtils.currentLine=2162707;
 //BA.debugLineNum = 2162707;BA.debugLine="Return result.ToString";
if (true) return _result.ToString();
RDebugUtils.currentLine=2162708;
 //BA.debugLineNum = 2162708;BA.debugLine="End Sub";
return "";
}
}