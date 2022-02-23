// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@OutputCustomType
public final class GetCodeSigningConfigAllowedPublisher {
    /**
     * The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user who can sign a code package.
     * 
     */
    private final List<String> signingProfileVersionArns;

    @OutputCustomType.Constructor({"signingProfileVersionArns"})
    private GetCodeSigningConfigAllowedPublisher(List<String> signingProfileVersionArns) {
        this.signingProfileVersionArns = Objects.requireNonNull(signingProfileVersionArns);
    }

    /**
     * The Amazon Resource Name (ARN) for each of the signing profiles. A signing profile defines a trusted user who can sign a code package.
     * 
     */
    public List<String> getSigningProfileVersionArns() {
        return this.signingProfileVersionArns;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetCodeSigningConfigAllowedPublisher defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private List<String> signingProfileVersionArns;

        public Builder() {
    	      // Empty
        }

        public Builder(GetCodeSigningConfigAllowedPublisher defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.signingProfileVersionArns = defaults.signingProfileVersionArns;
        }

        public Builder setSigningProfileVersionArns(List<String> signingProfileVersionArns) {
            this.signingProfileVersionArns = Objects.requireNonNull(signingProfileVersionArns);
            return this;
        }
        public GetCodeSigningConfigAllowedPublisher build() {
            return new GetCodeSigningConfigAllowedPublisher(signingProfileVersionArns);
        }
    }
}
