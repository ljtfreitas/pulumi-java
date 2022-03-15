// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1.outputs;

import io.pulumi.core.annotations.CustomType;
import io.pulumi.googlenative.firebasehosting_v1beta1.outputs.CertDnsChallengeResponse;
import io.pulumi.googlenative.firebasehosting_v1beta1.outputs.CertHttpChallengeResponse;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DomainProvisioningResponse {
    /**
     * The TXT records (for the certificate challenge) that were found at the last DNS fetch.
     * 
     */
    private final List<String> certChallengeDiscoveredTxt;
    /**
     * The DNS challenge for generating a certificate.
     * 
     */
    private final CertDnsChallengeResponse certChallengeDns;
    /**
     * The HTTP challenge for generating a certificate.
     * 
     */
    private final CertHttpChallengeResponse certChallengeHttp;
    /**
     * The certificate provisioning status; updated when Firebase Hosting provisions an SSL certificate for the domain.
     * 
     */
    private final String certStatus;
    /**
     * The IPs found at the last DNS fetch.
     * 
     */
    private final List<String> discoveredIps;
    /**
     * The time at which the last DNS fetch occurred.
     * 
     */
    private final String dnsFetchTime;
    /**
     * The DNS record match status as of the last DNS fetch.
     * 
     */
    private final String dnsStatus;
    /**
     * The list of IPs to which the domain is expected to resolve.
     * 
     */
    private final List<String> expectedIps;

    @CustomType.Constructor
    private DomainProvisioningResponse(
        @CustomType.Parameter("certChallengeDiscoveredTxt") List<String> certChallengeDiscoveredTxt,
        @CustomType.Parameter("certChallengeDns") CertDnsChallengeResponse certChallengeDns,
        @CustomType.Parameter("certChallengeHttp") CertHttpChallengeResponse certChallengeHttp,
        @CustomType.Parameter("certStatus") String certStatus,
        @CustomType.Parameter("discoveredIps") List<String> discoveredIps,
        @CustomType.Parameter("dnsFetchTime") String dnsFetchTime,
        @CustomType.Parameter("dnsStatus") String dnsStatus,
        @CustomType.Parameter("expectedIps") List<String> expectedIps) {
        this.certChallengeDiscoveredTxt = certChallengeDiscoveredTxt;
        this.certChallengeDns = certChallengeDns;
        this.certChallengeHttp = certChallengeHttp;
        this.certStatus = certStatus;
        this.discoveredIps = discoveredIps;
        this.dnsFetchTime = dnsFetchTime;
        this.dnsStatus = dnsStatus;
        this.expectedIps = expectedIps;
    }

    /**
     * The TXT records (for the certificate challenge) that were found at the last DNS fetch.
     * 
    */
    public List<String> getCertChallengeDiscoveredTxt() {
        return this.certChallengeDiscoveredTxt;
    }
    /**
     * The DNS challenge for generating a certificate.
     * 
    */
    public CertDnsChallengeResponse getCertChallengeDns() {
        return this.certChallengeDns;
    }
    /**
     * The HTTP challenge for generating a certificate.
     * 
    */
    public CertHttpChallengeResponse getCertChallengeHttp() {
        return this.certChallengeHttp;
    }
    /**
     * The certificate provisioning status; updated when Firebase Hosting provisions an SSL certificate for the domain.
     * 
    */
    public String getCertStatus() {
        return this.certStatus;
    }
    /**
     * The IPs found at the last DNS fetch.
     * 
    */
    public List<String> getDiscoveredIps() {
        return this.discoveredIps;
    }
    /**
     * The time at which the last DNS fetch occurred.
     * 
    */
    public String getDnsFetchTime() {
        return this.dnsFetchTime;
    }
    /**
     * The DNS record match status as of the last DNS fetch.
     * 
    */
    public String getDnsStatus() {
        return this.dnsStatus;
    }
    /**
     * The list of IPs to which the domain is expected to resolve.
     * 
    */
    public List<String> getExpectedIps() {
        return this.expectedIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DomainProvisioningResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> certChallengeDiscoveredTxt;
        private CertDnsChallengeResponse certChallengeDns;
        private CertHttpChallengeResponse certChallengeHttp;
        private String certStatus;
        private List<String> discoveredIps;
        private String dnsFetchTime;
        private String dnsStatus;
        private List<String> expectedIps;

        public Builder() {
    	      // Empty
        }

        public Builder(DomainProvisioningResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.certChallengeDiscoveredTxt = defaults.certChallengeDiscoveredTxt;
    	      this.certChallengeDns = defaults.certChallengeDns;
    	      this.certChallengeHttp = defaults.certChallengeHttp;
    	      this.certStatus = defaults.certStatus;
    	      this.discoveredIps = defaults.discoveredIps;
    	      this.dnsFetchTime = defaults.dnsFetchTime;
    	      this.dnsStatus = defaults.dnsStatus;
    	      this.expectedIps = defaults.expectedIps;
        }

        public Builder certChallengeDiscoveredTxt(List<String> certChallengeDiscoveredTxt) {
            this.certChallengeDiscoveredTxt = Objects.requireNonNull(certChallengeDiscoveredTxt);
            return this;
        }

        public Builder certChallengeDns(CertDnsChallengeResponse certChallengeDns) {
            this.certChallengeDns = Objects.requireNonNull(certChallengeDns);
            return this;
        }

        public Builder certChallengeHttp(CertHttpChallengeResponse certChallengeHttp) {
            this.certChallengeHttp = Objects.requireNonNull(certChallengeHttp);
            return this;
        }

        public Builder certStatus(String certStatus) {
            this.certStatus = Objects.requireNonNull(certStatus);
            return this;
        }

        public Builder discoveredIps(List<String> discoveredIps) {
            this.discoveredIps = Objects.requireNonNull(discoveredIps);
            return this;
        }

        public Builder dnsFetchTime(String dnsFetchTime) {
            this.dnsFetchTime = Objects.requireNonNull(dnsFetchTime);
            return this;
        }

        public Builder dnsStatus(String dnsStatus) {
            this.dnsStatus = Objects.requireNonNull(dnsStatus);
            return this;
        }

        public Builder expectedIps(List<String> expectedIps) {
            this.expectedIps = Objects.requireNonNull(expectedIps);
            return this;
        }
        public DomainProvisioningResponse build() {
            return new DomainProvisioningResponse(certChallengeDiscoveredTxt, certChallengeDns, certChallengeHttp, certStatus, discoveredIps, dnsFetchTime, dnsStatus, expectedIps);
        }
    }
}
