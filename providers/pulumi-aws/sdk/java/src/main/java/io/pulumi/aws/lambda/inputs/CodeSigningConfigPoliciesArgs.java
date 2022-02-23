// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class CodeSigningConfigPoliciesArgs extends io.pulumi.resources.ResourceArgs {

    public static final CodeSigningConfigPoliciesArgs Empty = new CodeSigningConfigPoliciesArgs();

    /**
     * Code signing configuration policy for deployment validation failure. If you set the policy to Enforce, Lambda blocks the deployment request if code-signing validation checks fail. If you set the policy to Warn, Lambda allows the deployment and creates a CloudWatch log. Valid values: `Warn`, `Enforce`. Default value: `Warn`.
     * 
     */
    @InputImport(name="untrustedArtifactOnDeployment", required=true)
    private final Input<String> untrustedArtifactOnDeployment;

    public Input<String> getUntrustedArtifactOnDeployment() {
        return this.untrustedArtifactOnDeployment;
    }

    public CodeSigningConfigPoliciesArgs(Input<String> untrustedArtifactOnDeployment) {
        this.untrustedArtifactOnDeployment = Objects.requireNonNull(untrustedArtifactOnDeployment, "expected parameter 'untrustedArtifactOnDeployment' to be non-null");
    }

    private CodeSigningConfigPoliciesArgs() {
        this.untrustedArtifactOnDeployment = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeSigningConfigPoliciesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> untrustedArtifactOnDeployment;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeSigningConfigPoliciesArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.untrustedArtifactOnDeployment = defaults.untrustedArtifactOnDeployment;
        }

        public Builder setUntrustedArtifactOnDeployment(Input<String> untrustedArtifactOnDeployment) {
            this.untrustedArtifactOnDeployment = Objects.requireNonNull(untrustedArtifactOnDeployment);
            return this;
        }

        public Builder setUntrustedArtifactOnDeployment(String untrustedArtifactOnDeployment) {
            this.untrustedArtifactOnDeployment = Input.of(Objects.requireNonNull(untrustedArtifactOnDeployment));
            return this;
        }
        public CodeSigningConfigPoliciesArgs build() {
            return new CodeSigningConfigPoliciesArgs(untrustedArtifactOnDeployment);
        }
    }
}
