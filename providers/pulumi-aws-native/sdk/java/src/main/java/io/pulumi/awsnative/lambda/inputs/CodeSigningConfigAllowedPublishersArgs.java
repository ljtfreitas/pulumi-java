// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.lambda.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;


/**
 * When the CodeSigningConfig is later on attached to a function, the function code will be expected to be signed by profiles from this list
 * 
 */
public final class CodeSigningConfigAllowedPublishersArgs extends io.pulumi.resources.ResourceArgs {

    public static final CodeSigningConfigAllowedPublishersArgs Empty = new CodeSigningConfigAllowedPublishersArgs();

    /**
     * List of Signing profile version Arns
     * 
     */
    @InputImport(name="signingProfileVersionArns", required=true)
        private final Input<List<String>> signingProfileVersionArns;

    public Input<List<String>> getSigningProfileVersionArns() {
        return this.signingProfileVersionArns;
    }

    public CodeSigningConfigAllowedPublishersArgs(Input<List<String>> signingProfileVersionArns) {
        this.signingProfileVersionArns = Objects.requireNonNull(signingProfileVersionArns, "expected parameter 'signingProfileVersionArns' to be non-null");
    }

    private CodeSigningConfigAllowedPublishersArgs() {
        this.signingProfileVersionArns = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeSigningConfigAllowedPublishersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<List<String>> signingProfileVersionArns;

        public Builder() {
    	      // Empty
        }

        public Builder(CodeSigningConfigAllowedPublishersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.signingProfileVersionArns = defaults.signingProfileVersionArns;
        }

        public Builder setSigningProfileVersionArns(Input<List<String>> signingProfileVersionArns) {
            this.signingProfileVersionArns = Objects.requireNonNull(signingProfileVersionArns);
            return this;
        }

        public Builder setSigningProfileVersionArns(List<String> signingProfileVersionArns) {
            this.signingProfileVersionArns = Input.of(Objects.requireNonNull(signingProfileVersionArns));
            return this;
        }
        public CodeSigningConfigAllowedPublishersArgs build() {
            return new CodeSigningConfigAllowedPublishersArgs(signingProfileVersionArns);
        }
    }
}
