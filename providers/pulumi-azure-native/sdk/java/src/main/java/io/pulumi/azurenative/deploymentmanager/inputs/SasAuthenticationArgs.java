// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.deploymentmanager.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


/**
 * Defines the properties to access the artifacts using an Azure Storage SAS URI.
 * 
 */
public final class SasAuthenticationArgs extends io.pulumi.resources.ResourceArgs {

    public static final SasAuthenticationArgs Empty = new SasAuthenticationArgs();

    /**
     * The SAS URI to the Azure Storage blob container. Any offset from the root of the container to where the artifacts are located can be defined in the artifactRoot.
     * 
     */
    @InputImport(name="sasUri", required=true)
    private final Input<String> sasUri;

    public Input<String> getSasUri() {
        return this.sasUri;
    }

    /**
     * The authentication type
     * Expected value is 'Sas'.
     * 
     */
    @InputImport(name="type", required=true)
    private final Input<String> type;

    public Input<String> getType() {
        return this.type;
    }

    public SasAuthenticationArgs(
        Input<String> sasUri,
        Input<String> type) {
        this.sasUri = Objects.requireNonNull(sasUri, "expected parameter 'sasUri' to be non-null");
        this.type = Objects.requireNonNull(type, "expected parameter 'type' to be non-null");
    }

    private SasAuthenticationArgs() {
        this.sasUri = Input.empty();
        this.type = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SasAuthenticationArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> sasUri;
        private Input<String> type;

        public Builder() {
    	      // Empty
        }

        public Builder(SasAuthenticationArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sasUri = defaults.sasUri;
    	      this.type = defaults.type;
        }

        public Builder setSasUri(Input<String> sasUri) {
            this.sasUri = Objects.requireNonNull(sasUri);
            return this;
        }

        public Builder setSasUri(String sasUri) {
            this.sasUri = Input.of(Objects.requireNonNull(sasUri));
            return this;
        }

        public Builder setType(Input<String> type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }

        public Builder setType(String type) {
            this.type = Input.of(Objects.requireNonNull(type));
            return this;
        }

        public SasAuthenticationArgs build() {
            return new SasAuthenticationArgs(sasUri, type);
        }
    }
}
