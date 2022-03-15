// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.websecurityscanner_v1.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


/**
 * Describes authentication configuration when Web-Security-Scanner service account is added in Identity-Aware-Proxy (IAP) access policies.
 * 
 */
public final class IapTestServiceAccountInfoArgs extends io.pulumi.resources.ResourceArgs {

    public static final IapTestServiceAccountInfoArgs Empty = new IapTestServiceAccountInfoArgs();

    /**
     * Describes OAuth2 client id of resources protected by Identity-Aware-Proxy (IAP).
     * 
     */
    @Import(name="targetAudienceClientId", required=true)
      private final Output<String> targetAudienceClientId;

    public Output<String> getTargetAudienceClientId() {
        return this.targetAudienceClientId;
    }

    public IapTestServiceAccountInfoArgs(Output<String> targetAudienceClientId) {
        this.targetAudienceClientId = Objects.requireNonNull(targetAudienceClientId, "expected parameter 'targetAudienceClientId' to be non-null");
    }

    private IapTestServiceAccountInfoArgs() {
        this.targetAudienceClientId = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IapTestServiceAccountInfoArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> targetAudienceClientId;

        public Builder() {
    	      // Empty
        }

        public Builder(IapTestServiceAccountInfoArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.targetAudienceClientId = defaults.targetAudienceClientId;
        }

        public Builder targetAudienceClientId(Output<String> targetAudienceClientId) {
            this.targetAudienceClientId = Objects.requireNonNull(targetAudienceClientId);
            return this;
        }

        public Builder targetAudienceClientId(String targetAudienceClientId) {
            this.targetAudienceClientId = Output.of(Objects.requireNonNull(targetAudienceClientId));
            return this;
        }
        public IapTestServiceAccountInfoArgs build() {
            return new IapTestServiceAccountInfoArgs(targetAudienceClientId);
        }
    }
}
