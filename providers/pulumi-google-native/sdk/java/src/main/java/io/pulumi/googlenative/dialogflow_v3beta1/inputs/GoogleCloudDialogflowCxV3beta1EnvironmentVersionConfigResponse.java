// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.dialogflow_v3beta1.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Configuration for the version.
 * 
 */
public final class GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse extends io.pulumi.resources.InvokeArgs {

    public static final GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse Empty = new GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse();

    /**
     * Format: projects//locations//agents//flows//versions/.
     * 
     */
    @Import(name="version", required=true)
      private final String version;

    public String getVersion() {
        return this.version;
    }

    public GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse(String version) {
        this.version = Objects.requireNonNull(version, "expected parameter 'version' to be non-null");
    }

    private GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse() {
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String version;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.version = defaults.version;
        }

        public Builder version(String version) {
            this.version = Objects.requireNonNull(version);
            return this;
        }
        public GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse build() {
            return new GoogleCloudDialogflowCxV3beta1EnvironmentVersionConfigResponse(version);
        }
    }
}
