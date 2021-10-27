package WhiteBox;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IpValidatorTest {

    @Test
    public void dummyTest(){
        //@TODO: Delete/modify me
        IpValidator tool = new IpValidatorImpl();
        assertEquals("Neither",tool.validIPAddress("0"));
    }

    //@TODO: Create more tests
    @Test
    public void ipV4Test() {
        IpValidator tool = new IpValidatorImpl();
        assertEquals("IPv4",tool.validIPAddress("255.255.255.255"));
        assertEquals("Neither",tool.validIPAddress( "255.255.255.256"));
        assertEquals("Neither",tool.validIPAddress("-00.255.255.255"));
        assertEquals("Neither",tool.validIPAddress("aaa.aaa.axy.x&a"));
        assertEquals("IPv4",tool.validIPAddress("0.0.0.0"));
        assertEquals("Neither",tool.validIPAddress(":::::::::::::"));
        assertEquals("Neither",tool.validIPAddress("127.00.0.0.") );
        assertEquals("Neither",tool.validIPAddress("-1.255.255.255"));
        assertEquals("Neither",tool.validIPAddress("001.255.255.255"));
        assertEquals("Neither",tool.validIPAddress("100.-1.255.255"));
        assertEquals("Neither",tool.validIPAddress("235.255.255.256"));
        assertEquals("Neither",tool.validIPAddress(".20.20.20"));
        assertEquals("Neither",tool.validIPAddress("2001:0db8:85a3::8A2E:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("02008:0db8:85a3:0000:0000:8a2e:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("20EE:FGb8:85a3:0:0:8A2E:0370:7334") );
        assertEquals("Neither",tool.validIPAddress("::192:168:0:1"));
        assertEquals("IPv6",tool.validIPAddress("2001:db8:85a3:0:0:8A2E:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("3213:db8:85a3:0:0:8A2c:037:7334:"));
        assertEquals("Neither",tool.validIPAddress("2001:db8:85a3:0:0:832E:0370:73349"));
        assertEquals("Neither",tool.validIPAddress("3131:db8:85a3:012:0:8A2E:0370:"));
        assertEquals("Neither",tool.validIPAddress(":2101:db8:85a3:0:0:8A2E:0370:7334:"));
        assertEquals("Neither",tool.validIPAddress("2111:db8:85a3:0:0:8A2E:0370:73345"));
        assertEquals("Neither",tool.validIPAddress("3211:db8:85/3:0211:0:8A2E::7334"));
        assertEquals("Neither",tool.validIPAddress("2131:db8:85¡û3:0:0311:8A2E:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("3123:db8:85a3:0:0231::0370:7334"));
        assertEquals("Neither",tool.validIPAddress("4121:db8:85a3:0:0::02001:7334"));
        assertEquals("Neither",tool.validIPAddress("-010.255.255.255"));
        assertEquals("Neither",tool.validIPAddress("-010.255.256.255"));
        assertEquals("Neither",tool.validIPAddress("-010.255.255.-1"));
        assertEquals("IPv6",tool.validIPAddress("2020:db8:85a3:0111:0:8c2E:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("020t08:0db8:85a3:0:0000:8a2e:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("0208:0db8:85a3:0t:00000:18a2e:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("0208:0db8:85a3:0t:0:18a2:0370:73134")); 
        assertEquals("IPv4",tool.validIPAddress("255.255.255.255"));
        assertEquals("Neither",tool.validIPAddress("-00.255.255.255"));
        assertEquals("Neither",tool.validIPAddress("aaa.aaa.axy.#&a"));
        assertEquals("IPv4",tool.validIPAddress("0.0.0.0"));
        assertEquals("Neither",tool.validIPAddress("127.0.0.0."));
        assertEquals("Neither",tool.validIPAddress("-1.255.255.255"));
        assertEquals("Neither",tool.validIPAddress("001.255.255.255"));
        assertEquals("Neither",tool.validIPAddress("255.255.255.256"));
        assertEquals("Neither",tool.validIPAddress(".20.20.20"));
        assertEquals("Neither",tool.validIPAddress("2001:0db8:85a3::8A2E:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("02001:0db8:85a3:0000:0000:8a2e:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("20EE:FGb8:85a3:0:0:8A2E:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("::192:168:0:1"));
        assertEquals("IPv6",tool.validIPAddress("1234:db8:85a3:0:0:8A2E:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("1234:ab8:22c3:0:0:1A2E:0370:4134:"));
        assertEquals("Neither",tool.validIPAddress("1234:ab8:22c3:0:0:1A2E:0370:41349"));
        assertEquals("Neither",tool.validIPAddress("1234:ab8:22c3:0:0:1A2E:0370:"));
        assertEquals("Neither",tool.validIPAddress(":1234:ab8:22c3:0:0:1A2E:0370:4134:"));
        assertEquals("Neither",tool.validIPAddress("1234:ab8:22c3:0:0:1A2E:0370:41345"));
        assertEquals("Neither",tool.validIPAddress("1234:ab8:22/3:0:0:1A2E::4134"));
        assertEquals("Neither",tool.validIPAddress("1234:ab8:22¡û3:0:0:1A2E:0370:4134"));
        assertEquals("Neither",tool.validIPAddress("1234:ab8:22c3:0:0::1370:4134"));
        assertEquals("Neither",tool.validIPAddress("1234:ab8:22c3:0:0::12001:4134"));
        assertEquals("Neither",tool.validIPAddress("02008:0db8:85a3:0000:0000:8a2e:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("20EE:FGb8:85a3:0:0:8A2E:0370:7334") );
        assertEquals("Neither",tool.validIPAddress("::192:168:0:1"));
        assertEquals("IPv6",tool.validIPAddress("2001:db8:85a3:0:0:8A2E:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("3213:db8:85a3:0:0:8A2c:037:7334:"));
        assertEquals("Neither",tool.validIPAddress("2001:db8:85a3:0:0:832E:0370:73349"));
        assertEquals("Neither",tool.validIPAddress("3131:db8:85a3:012:0:8A2E:0370:"));
        assertEquals("Neither",tool.validIPAddress(":2101:db8:85a3:0:0:8A2E:0370:7334:"));
        assertEquals("Neither",tool.validIPAddress("2111:db8:85a3:0:0:8A2E:0370:73345"));
        assertEquals("Neither",tool.validIPAddress("3211:db8:85/3:0211:0:8A2E::7334"));
        assertEquals("Neither",tool.validIPAddress("2131:db8:85¡û3:0:0311:8A2E:0370:7334"));
        assertEquals("Neither",tool.validIPAddress("3123:db8:85a3:0:0231::0370:7334"));
        assertEquals("Neither",tool.validIPAddress("4121:db8:85a3:0:0::02001:7334"));
        
    }
}
