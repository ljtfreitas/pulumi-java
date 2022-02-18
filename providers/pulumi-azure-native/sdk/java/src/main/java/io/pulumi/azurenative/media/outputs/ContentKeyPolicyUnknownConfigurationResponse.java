// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class ContentKeyPolicyUnknownConfigurationResponse {
    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyUnknownConfiguration'.
     * 
     */
    private final String odataType;

    @OutputCustomType.Constructor({"odataType"})
    private ContentKeyPolicyUnknownConfigurationResponse(String odataType) {
        this.odataType = Objects.requireNonNull(odataType);
    }

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyUnknownConfiguration'.
     * 
     */
    public String getOdataType() {
        return this.odataType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyUnknownConfigurationResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyUnknownConfigurationResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public ContentKeyPolicyUnknownConfigurationResponse build() {
            return new ContentKeyPolicyUnknownConfigurationResponse(odataType);
        }
    }
}
