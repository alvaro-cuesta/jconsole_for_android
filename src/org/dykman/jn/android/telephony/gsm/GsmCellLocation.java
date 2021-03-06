package org.dykman.jn.android.telephony.gsm;
public class GsmCellLocation extends android.telephony.gsm.GsmCellLocation{
protected org.dykman.j.JInterface jInterface = null;
protected java.lang.String jlocale = null;
protected java.lang.String jchildid = null;
protected java.lang.String jchildidx = null;
protected java.util.ArrayList jnOverrideList = null;
protected void jparseargs (java.lang.String jlocale, java.lang.String jchildid, java.lang.String joverride ) { this.jlocale = jlocale; this.jchildid = jchildid; if (jchildid != null && jchildid.length() > 0) jchildidx = jchildid + "_"; else jchildidx = ""; if (joverride != null && joverride.length() > 0) { java.lang.String[] ss = joverride.split(" "); for (int i = 0; i < ss.length; i++) setjnOverride(ss[i]); } }
public void clearjnOverride () { jnOverrideList.clear (); }
public void setjnOverride (java.lang.String arg1 ) { if (!testjnOverride (arg1)) jnOverrideList.add (arg1); }
public void setjnOverride (java.lang.String arg1, boolean arg2 ) { if (arg2) { if (!testjnOverride (arg1)) jnOverrideList.add (arg1); } else jnOverrideList.remove (arg1); }
public boolean testjnOverride (java.lang.String arg1 ) { return jnOverrideList.contains (arg1); }
public GsmCellLocation(String jlocale,String jchildid,String joverride ){ super(); jnOverrideList = new java.util.ArrayList(); jparseargs( jlocale, jchildid, joverride ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; if (testjnOverride( "jcreate" )) jInterface.Jnido( this, jchildidx + "jcreate_" + jlocale + "_", null ); }
public GsmCellLocation(android.os.Bundle arg1, java.lang.String jlocale,String jchildid,String joverride ) { super( arg1); jnOverrideList = new java.util.ArrayList(); jparseargs( jlocale, jchildid, joverride ); jInterface = org.dykman.j.android.JConsoleApp.theApp.jInterface; if (testjnOverride( "jcreate" )) jInterface.Jnido( this, jchildidx + "jcreate_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public boolean equals(java.lang.Object arg1) { if (!testjnOverride( "equals" )) return super.equals( arg1); return (java.lang.Boolean) jInterface.Jnido( this, jchildidx + "equals_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
@Override public java.lang.String toString(){ if (!testjnOverride( "toString" )) return super.toString(); return (java.lang.String) jInterface.Jnido( this, jchildidx + "toString_" + jlocale + "_", null ); }
@Override public int hashCode(){ if (!testjnOverride( "hashCode" )) return super.hashCode(); return (java.lang.Integer) jInterface.Jnido( this, jchildidx + "hashCode_" + jlocale + "_", null ); }
@Override public int getLac(){ if (!testjnOverride( "getLac" )) return super.getLac(); return (java.lang.Integer) jInterface.Jnido( this, jchildidx + "getLac_" + jlocale + "_", null ); }
@Override public int getCid(){ if (!testjnOverride( "getCid" )) return super.getCid(); return (java.lang.Integer) jInterface.Jnido( this, jchildidx + "getCid_" + jlocale + "_", null ); }
@Override public void setStateInvalid(){ if (!testjnOverride( "setStateInvalid" )) { super.setStateInvalid(); return; } jInterface.Jnido( this, jchildidx + "setStateInvalid_" + jlocale + "_", null ); }
@Override public void setLacAndCid(int arg1,int arg2) { if (!testjnOverride( "setLacAndCid" )) { super.setLacAndCid( arg1, arg2); return; } jInterface.Jnido( this, jchildidx + "setLacAndCid_" + jlocale + "_", new java.lang.Object[]{ arg1, arg2 } ); }
@Override public void fillInNotifierBundle(android.os.Bundle arg1) { if (!testjnOverride( "fillInNotifierBundle" )) { super.fillInNotifierBundle( arg1); return; } jInterface.Jnido( this, jchildidx + "fillInNotifierBundle_" + jlocale + "_", new java.lang.Object[]{ arg1 } ); }
}
