// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.policysimulator_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.googlenative.policysimulator_v1.enums.GoogleCloudPolicysimulatorV1ReplayConfigLogSource;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The configuration used for a Replay.
 * 
 */
public final class GoogleCloudPolicysimulatorV1ReplayConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final GoogleCloudPolicysimulatorV1ReplayConfigArgs Empty = new GoogleCloudPolicysimulatorV1ReplayConfigArgs();

    /**
     * The logs to use as input for the Replay.
     * 
     */
    @Import(name="logSource")
      private final @Nullable Output<GoogleCloudPolicysimulatorV1ReplayConfigLogSource> logSource;

    public Output<GoogleCloudPolicysimulatorV1ReplayConfigLogSource> getLogSource() {
        return this.logSource == null ? Output.empty() : this.logSource;
    }

    /**
     * A mapping of the resources that you want to simulate policies for and the policies that you want to simulate. Keys are the full resource names for the resources. For example, `//cloudresourcemanager.googleapis.com/projects/my-project`. For examples of full resource names for Google Cloud services, see https://cloud.google.com/iam/help/troubleshooter/full-resource-names. Values are Policy objects representing the policies that you want to simulate. Replays automatically take into account any IAM policies inherited through the resource hierarchy, and any policies set on descendant resources. You do not need to include these policies in the policy overlay.
     * 
     */
    @Import(name="policyOverlay")
      private final @Nullable Output<Map<String,String>> policyOverlay;

    public Output<Map<String,String>> getPolicyOverlay() {
        return this.policyOverlay == null ? Output.empty() : this.policyOverlay;
    }

    public GoogleCloudPolicysimulatorV1ReplayConfigArgs(
        @Nullable Output<GoogleCloudPolicysimulatorV1ReplayConfigLogSource> logSource,
        @Nullable Output<Map<String,String>> policyOverlay) {
        this.logSource = logSource;
        this.policyOverlay = policyOverlay;
    }

    private GoogleCloudPolicysimulatorV1ReplayConfigArgs() {
        this.logSource = Output.empty();
        this.policyOverlay = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudPolicysimulatorV1ReplayConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<GoogleCloudPolicysimulatorV1ReplayConfigLogSource> logSource;
        private @Nullable Output<Map<String,String>> policyOverlay;

        public Builder() {
    	      // Empty
        }

        public Builder(GoogleCloudPolicysimulatorV1ReplayConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logSource = defaults.logSource;
    	      this.policyOverlay = defaults.policyOverlay;
        }

        public Builder logSource(@Nullable Output<GoogleCloudPolicysimulatorV1ReplayConfigLogSource> logSource) {
            this.logSource = logSource;
            return this;
        }

        public Builder logSource(@Nullable GoogleCloudPolicysimulatorV1ReplayConfigLogSource logSource) {
            this.logSource = Output.ofNullable(logSource);
            return this;
        }

        public Builder policyOverlay(@Nullable Output<Map<String,String>> policyOverlay) {
            this.policyOverlay = policyOverlay;
            return this;
        }

        public Builder policyOverlay(@Nullable Map<String,String> policyOverlay) {
            this.policyOverlay = Output.ofNullable(policyOverlay);
            return this;
        }
        public GoogleCloudPolicysimulatorV1ReplayConfigArgs build() {
            return new GoogleCloudPolicysimulatorV1ReplayConfigArgs(logSource, policyOverlay);
        }
    }
}
