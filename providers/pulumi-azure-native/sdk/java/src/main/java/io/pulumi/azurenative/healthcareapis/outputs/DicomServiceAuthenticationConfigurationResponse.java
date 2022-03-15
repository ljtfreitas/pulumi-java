// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.healthcareapis.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DicomServiceAuthenticationConfigurationResponse {
    /**
     * The audiences for the service
     * 
     */
    private final List<String> audiences;
    /**
     * The authority url for the service
     * 
     */
    private final String authority;

    @CustomType.Constructor
    private DicomServiceAuthenticationConfigurationResponse(
        @CustomType.Parameter("audiences") List<String> audiences,
        @CustomType.Parameter("authority") String authority) {
        this.audiences = audiences;
        this.authority = authority;
    }

    /**
     * The audiences for the service
     * 
    */
    public List<String> getAudiences() {
        return this.audiences;
    }
    /**
     * The authority url for the service
     * 
    */
    public String getAuthority() {
        return this.authority;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DicomServiceAuthenticationConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> audiences;
        private String authority;

        public Builder() {
    	      // Empty
        }

        public Builder(DicomServiceAuthenticationConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.audiences = defaults.audiences;
    	      this.authority = defaults.authority;
        }

        public Builder audiences(List<String> audiences) {
            this.audiences = Objects.requireNonNull(audiences);
            return this;
        }

        public Builder authority(String authority) {
            this.authority = Objects.requireNonNull(authority);
            return this;
        }
        public DicomServiceAuthenticationConfigurationResponse build() {
            return new DicomServiceAuthenticationConfigurationResponse(audiences, authority);
        }
    }
}
