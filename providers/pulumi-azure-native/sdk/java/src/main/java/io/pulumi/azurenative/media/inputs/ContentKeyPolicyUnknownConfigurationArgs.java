// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.media.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Represents a ContentKeyPolicyConfiguration that is unavailable in the current API version.
 * 
 */
public final class ContentKeyPolicyUnknownConfigurationArgs extends io.pulumi.resources.ResourceArgs {

    public static final ContentKeyPolicyUnknownConfigurationArgs Empty = new ContentKeyPolicyUnknownConfigurationArgs();

    /**
     * The discriminator for derived types.
     * Expected value is '#Microsoft.Media.ContentKeyPolicyUnknownConfiguration'.
     * 
     */
    @InputImport(name="odataType", required=true)
        private final Input<String> odataType;

    public Input<String> getOdataType() {
        return this.odataType;
    }

    public ContentKeyPolicyUnknownConfigurationArgs(Input<String> odataType) {
        this.odataType = Objects.requireNonNull(odataType, "expected parameter 'odataType' to be non-null");
    }

    private ContentKeyPolicyUnknownConfigurationArgs() {
        this.odataType = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ContentKeyPolicyUnknownConfigurationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> odataType;

        public Builder() {
    	      // Empty
        }

        public Builder(ContentKeyPolicyUnknownConfigurationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.odataType = defaults.odataType;
        }

        public Builder setOdataType(Input<String> odataType) {
            this.odataType = Objects.requireNonNull(odataType);
            return this;
        }

        public Builder setOdataType(String odataType) {
            this.odataType = Input.of(Objects.requireNonNull(odataType));
            return this;
        }
        public ContentKeyPolicyUnknownConfigurationArgs build() {
            return new ContentKeyPolicyUnknownConfigurationArgs(odataType);
        }
    }
}
