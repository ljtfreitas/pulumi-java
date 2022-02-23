// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recaptchaenterprise_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Settings specific to keys that can be used for WAF (Web Application Firewall).
 * 
 */
public final class GoogleCloudRecaptchaenterpriseV1WafSettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRecaptchaenterpriseV1WafSettingsResponse Empty = new GoogleCloudRecaptchaenterpriseV1WafSettingsResponse();

    /**
     * The WAF feature for which this key is enabled.
     * 
     */
    @InputImport(name="wafFeature", required=true)
      private final String wafFeature;

    public String getWafFeature() {
        return this.wafFeature;
    }

    /**
     * The WAF service that uses this key.
     * 
     */
    @InputImport(name="wafService", required=true)
      private final String wafService;

    public String getWafService() {
        return this.wafService;
    }

    public GoogleCloudRecaptchaenterpriseV1WafSettingsResponse(
        String wafFeature,
        String wafService) {
        this.wafFeature = Objects.requireNonNull(wafFeature, "expected parameter 'wafFeature' to be non-null");
        this.wafService = Objects.requireNonNull(wafService, "expected parameter 'wafService' to be non-null");
    }

    private GoogleCloudRecaptchaenterpriseV1WafSettingsResponse() {
        this.wafFeature = null;
        this.wafService = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecaptchaenterpriseV1WafSettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String wafFeature;
        private String wafService;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecaptchaenterpriseV1WafSettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.wafFeature = defaults.wafFeature;
    	      this.wafService = defaults.wafService;
        }

        public Builder setWafFeature(String wafFeature) {
            this.wafFeature = Objects.requireNonNull(wafFeature);
            return this;
        }

        public Builder setWafService(String wafService) {
            this.wafService = Objects.requireNonNull(wafService);
            return this;
        }
        public GoogleCloudRecaptchaenterpriseV1WafSettingsResponse build() {
            return new GoogleCloudRecaptchaenterpriseV1WafSettingsResponse(wafFeature, wafService);
        }
    }
}
