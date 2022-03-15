// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.recaptchaenterprise_v1.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse {
    /**
     * If set to true, allowed_package_names are not enforced.
     * 
     */
    private final Boolean allowAllPackageNames;
    /**
     * Android package names of apps allowed to use the key. Example: 'com.companyname.appname'
     * 
     */
    private final List<String> allowedPackageNames;

    @CustomType.Constructor
    private GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse(
        @CustomType.Parameter("allowAllPackageNames") Boolean allowAllPackageNames,
        @CustomType.Parameter("allowedPackageNames") List<String> allowedPackageNames) {
        this.allowAllPackageNames = allowAllPackageNames;
        this.allowedPackageNames = allowedPackageNames;
    }

    /**
     * If set to true, allowed_package_names are not enforced.
     * 
    */
    public Boolean getAllowAllPackageNames() {
        return this.allowAllPackageNames;
    }
    /**
     * Android package names of apps allowed to use the key. Example: 'com.companyname.appname'
     * 
    */
    public List<String> getAllowedPackageNames() {
        return this.allowedPackageNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean allowAllPackageNames;
        private List<String> allowedPackageNames;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.allowAllPackageNames = defaults.allowAllPackageNames;
    	      this.allowedPackageNames = defaults.allowedPackageNames;
        }

        public Builder allowAllPackageNames(Boolean allowAllPackageNames) {
            this.allowAllPackageNames = Objects.requireNonNull(allowAllPackageNames);
            return this;
        }

        public Builder allowedPackageNames(List<String> allowedPackageNames) {
            this.allowedPackageNames = Objects.requireNonNull(allowedPackageNames);
            return this;
        }
        public GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse build() {
            return new GoogleCloudRecaptchaenterpriseV1AndroidKeySettingsResponse(allowAllPackageNames, allowedPackageNames);
        }
    }
}
