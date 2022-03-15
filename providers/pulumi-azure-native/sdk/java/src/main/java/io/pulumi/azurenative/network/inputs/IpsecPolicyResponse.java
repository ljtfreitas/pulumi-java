// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


/**
 * An IPSec Policy configuration for a virtual network gateway connection.
 * 
 */
public final class IpsecPolicyResponse extends io.pulumi.resources.InvokeArgs {

    public static final IpsecPolicyResponse Empty = new IpsecPolicyResponse();

    /**
     * The DH Group used in IKE Phase 1 for initial SA.
     * 
     */
    @Import(name="dhGroup", required=true)
      private final String dhGroup;

    public String getDhGroup() {
        return this.dhGroup;
    }

    /**
     * The IKE encryption algorithm (IKE phase 2).
     * 
     */
    @Import(name="ikeEncryption", required=true)
      private final String ikeEncryption;

    public String getIkeEncryption() {
        return this.ikeEncryption;
    }

    /**
     * The IKE integrity algorithm (IKE phase 2).
     * 
     */
    @Import(name="ikeIntegrity", required=true)
      private final String ikeIntegrity;

    public String getIkeIntegrity() {
        return this.ikeIntegrity;
    }

    /**
     * The IPSec encryption algorithm (IKE phase 1).
     * 
     */
    @Import(name="ipsecEncryption", required=true)
      private final String ipsecEncryption;

    public String getIpsecEncryption() {
        return this.ipsecEncryption;
    }

    /**
     * The IPSec integrity algorithm (IKE phase 1).
     * 
     */
    @Import(name="ipsecIntegrity", required=true)
      private final String ipsecIntegrity;

    public String getIpsecIntegrity() {
        return this.ipsecIntegrity;
    }

    /**
     * The Pfs Group used in IKE Phase 2 for new child SA.
     * 
     */
    @Import(name="pfsGroup", required=true)
      private final String pfsGroup;

    public String getPfsGroup() {
        return this.pfsGroup;
    }

    /**
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA) payload size in KB for a site to site VPN tunnel.
     * 
     */
    @Import(name="saDataSizeKilobytes", required=true)
      private final Integer saDataSizeKilobytes;

    public Integer getSaDataSizeKilobytes() {
        return this.saDataSizeKilobytes;
    }

    /**
     * The IPSec Security Association (also called Quick Mode or Phase 2 SA) lifetime in seconds for a site to site VPN tunnel.
     * 
     */
    @Import(name="saLifeTimeSeconds", required=true)
      private final Integer saLifeTimeSeconds;

    public Integer getSaLifeTimeSeconds() {
        return this.saLifeTimeSeconds;
    }

    public IpsecPolicyResponse(
        String dhGroup,
        String ikeEncryption,
        String ikeIntegrity,
        String ipsecEncryption,
        String ipsecIntegrity,
        String pfsGroup,
        Integer saDataSizeKilobytes,
        Integer saLifeTimeSeconds) {
        this.dhGroup = Objects.requireNonNull(dhGroup, "expected parameter 'dhGroup' to be non-null");
        this.ikeEncryption = Objects.requireNonNull(ikeEncryption, "expected parameter 'ikeEncryption' to be non-null");
        this.ikeIntegrity = Objects.requireNonNull(ikeIntegrity, "expected parameter 'ikeIntegrity' to be non-null");
        this.ipsecEncryption = Objects.requireNonNull(ipsecEncryption, "expected parameter 'ipsecEncryption' to be non-null");
        this.ipsecIntegrity = Objects.requireNonNull(ipsecIntegrity, "expected parameter 'ipsecIntegrity' to be non-null");
        this.pfsGroup = Objects.requireNonNull(pfsGroup, "expected parameter 'pfsGroup' to be non-null");
        this.saDataSizeKilobytes = Objects.requireNonNull(saDataSizeKilobytes, "expected parameter 'saDataSizeKilobytes' to be non-null");
        this.saLifeTimeSeconds = Objects.requireNonNull(saLifeTimeSeconds, "expected parameter 'saLifeTimeSeconds' to be non-null");
    }

    private IpsecPolicyResponse() {
        this.dhGroup = null;
        this.ikeEncryption = null;
        this.ikeIntegrity = null;
        this.ipsecEncryption = null;
        this.ipsecIntegrity = null;
        this.pfsGroup = null;
        this.saDataSizeKilobytes = null;
        this.saLifeTimeSeconds = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IpsecPolicyResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String dhGroup;
        private String ikeEncryption;
        private String ikeIntegrity;
        private String ipsecEncryption;
        private String ipsecIntegrity;
        private String pfsGroup;
        private Integer saDataSizeKilobytes;
        private Integer saLifeTimeSeconds;

        public Builder() {
    	      // Empty
        }

        public Builder(IpsecPolicyResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dhGroup = defaults.dhGroup;
    	      this.ikeEncryption = defaults.ikeEncryption;
    	      this.ikeIntegrity = defaults.ikeIntegrity;
    	      this.ipsecEncryption = defaults.ipsecEncryption;
    	      this.ipsecIntegrity = defaults.ipsecIntegrity;
    	      this.pfsGroup = defaults.pfsGroup;
    	      this.saDataSizeKilobytes = defaults.saDataSizeKilobytes;
    	      this.saLifeTimeSeconds = defaults.saLifeTimeSeconds;
        }

        public Builder dhGroup(String dhGroup) {
            this.dhGroup = Objects.requireNonNull(dhGroup);
            return this;
        }

        public Builder ikeEncryption(String ikeEncryption) {
            this.ikeEncryption = Objects.requireNonNull(ikeEncryption);
            return this;
        }

        public Builder ikeIntegrity(String ikeIntegrity) {
            this.ikeIntegrity = Objects.requireNonNull(ikeIntegrity);
            return this;
        }

        public Builder ipsecEncryption(String ipsecEncryption) {
            this.ipsecEncryption = Objects.requireNonNull(ipsecEncryption);
            return this;
        }

        public Builder ipsecIntegrity(String ipsecIntegrity) {
            this.ipsecIntegrity = Objects.requireNonNull(ipsecIntegrity);
            return this;
        }

        public Builder pfsGroup(String pfsGroup) {
            this.pfsGroup = Objects.requireNonNull(pfsGroup);
            return this;
        }

        public Builder saDataSizeKilobytes(Integer saDataSizeKilobytes) {
            this.saDataSizeKilobytes = Objects.requireNonNull(saDataSizeKilobytes);
            return this;
        }

        public Builder saLifeTimeSeconds(Integer saLifeTimeSeconds) {
            this.saLifeTimeSeconds = Objects.requireNonNull(saLifeTimeSeconds);
            return this;
        }
        public IpsecPolicyResponse build() {
            return new IpsecPolicyResponse(dhGroup, ikeEncryption, ikeIntegrity, ipsecEncryption, ipsecIntegrity, pfsGroup, saDataSizeKilobytes, saLifeTimeSeconds);
        }
    }
}
