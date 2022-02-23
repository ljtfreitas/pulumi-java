// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.firebasehosting_v1beta1.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import io.pulumi.googlenative.firebasehosting_v1beta1.outputs.DomainProvisioningResponse;
import io.pulumi.googlenative.firebasehosting_v1beta1.outputs.DomainRedirectResponse;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class GetDomainResult {
    /**
     * The domain name of the association.
     * 
     */
    private final String domainName;
    /**
     * If set, the domain should redirect with the provided parameters.
     * 
     */
    private final DomainRedirectResponse domainRedirect;
    /**
     * Information about the provisioning of certificates and the health of the DNS resolution for the domain.
     * 
     */
    private final DomainProvisioningResponse provisioning;
    /**
     * The site name of the association.
     * 
     */
    private final String site;
    /**
     * Additional status of the domain association.
     * 
     */
    private final String status;
    /**
     * The time at which the domain was last updated.
     * 
     */
    private final String updateTime;

    @OutputCustomType.Constructor({"domainName","domainRedirect","provisioning","site","status","updateTime"})
    private GetDomainResult(
        String domainName,
        DomainRedirectResponse domainRedirect,
        DomainProvisioningResponse provisioning,
        String site,
        String status,
        String updateTime) {
        this.domainName = Objects.requireNonNull(domainName);
        this.domainRedirect = Objects.requireNonNull(domainRedirect);
        this.provisioning = Objects.requireNonNull(provisioning);
        this.site = Objects.requireNonNull(site);
        this.status = Objects.requireNonNull(status);
        this.updateTime = Objects.requireNonNull(updateTime);
    }

    /**
     * The domain name of the association.
     * 
     */
    public String getDomainName() {
        return this.domainName;
    }
    /**
     * If set, the domain should redirect with the provided parameters.
     * 
     */
    public DomainRedirectResponse getDomainRedirect() {
        return this.domainRedirect;
    }
    /**
     * Information about the provisioning of certificates and the health of the DNS resolution for the domain.
     * 
     */
    public DomainProvisioningResponse getProvisioning() {
        return this.provisioning;
    }
    /**
     * The site name of the association.
     * 
     */
    public String getSite() {
        return this.site;
    }
    /**
     * Additional status of the domain association.
     * 
     */
    public String getStatus() {
        return this.status;
    }
    /**
     * The time at which the domain was last updated.
     * 
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDomainResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String domainName;
        private DomainRedirectResponse domainRedirect;
        private DomainProvisioningResponse provisioning;
        private String site;
        private String status;
        private String updateTime;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDomainResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.domainName = defaults.domainName;
    	      this.domainRedirect = defaults.domainRedirect;
    	      this.provisioning = defaults.provisioning;
    	      this.site = defaults.site;
    	      this.status = defaults.status;
    	      this.updateTime = defaults.updateTime;
        }

        public Builder setDomainName(String domainName) {
            this.domainName = Objects.requireNonNull(domainName);
            return this;
        }

        public Builder setDomainRedirect(DomainRedirectResponse domainRedirect) {
            this.domainRedirect = Objects.requireNonNull(domainRedirect);
            return this;
        }

        public Builder setProvisioning(DomainProvisioningResponse provisioning) {
            this.provisioning = Objects.requireNonNull(provisioning);
            return this;
        }

        public Builder setSite(String site) {
            this.site = Objects.requireNonNull(site);
            return this;
        }

        public Builder setStatus(String status) {
            this.status = Objects.requireNonNull(status);
            return this;
        }

        public Builder setUpdateTime(String updateTime) {
            this.updateTime = Objects.requireNonNull(updateTime);
            return this;
        }
        public GetDomainResult build() {
            return new GetDomainResult(domainName, domainRedirect, provisioning, site, status, updateTime);
        }
    }
}
