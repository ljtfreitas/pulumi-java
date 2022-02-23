// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recaptchaenterprise_v1.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * Settings specific to keys that can be used by iOS apps.
 * 
 */
public final class GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse Empty = new GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse();

    /**
     * If set to true, allowed_bundle_ids are not enforced.
     * 
     */
    @InputImport(name="allowAllBundleIds", required=true)
      private final Boolean allowAllBundleIds;

    public Boolean getAllowAllBundleIds() {
        return this.allowAllBundleIds;
    }

    /**
     * iOS bundle ids of apps allowed to use the key. Example: 'com.companyname.productname.appname'
     * 
     */
    @InputImport(name="allowedBundleIds", required=true)
      private final List<String> allowedBundleIds;

    public List<String> getAllowedBundleIds() {
        return this.allowedBundleIds;
    }

    public GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse(
        Boolean allowAllBundleIds,
        List<String> allowedBundleIds) {
        this.allowAllBundleIds = Objects.requireNonNull(allowAllBundleIds, "expected parameter 'allowAllBundleIds' to be non-null");
        this.allowedBundleIds = Objects.requireNonNull(allowedBundleIds, "expected parameter 'allowedBundleIds' to be non-null");
    }

    private GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse() {
        this.allowAllBundleIds = null;
        this.allowedBundleIds = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowAllBundleIds;
        private List<String> allowedBundleIds;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllBundleIds = defaults.allowAllBundleIds;
    	      this.allowedBundleIds = defaults.allowedBundleIds;
        }

        public Builder setAllowAllBundleIds(Boolean allowAllBundleIds) {
            this.allowAllBundleIds = Objects.requireNonNull(allowAllBundleIds);
            return this;
        }

        public Builder setAllowedBundleIds(List<String> allowedBundleIds) {
            this.allowedBundleIds = Objects.requireNonNull(allowedBundleIds);
            return this;
        }
        public GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse build() {
            return new GoogleCloudRecaptchaenterpriseV1IOSKeySettingsResponse(allowAllBundleIds, allowedBundleIds);
        }
    }
}
