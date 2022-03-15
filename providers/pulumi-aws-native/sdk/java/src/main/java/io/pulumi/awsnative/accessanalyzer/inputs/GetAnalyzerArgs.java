// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.accessanalyzer.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;


public final class GetAnalyzerArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetAnalyzerArgs Empty = new GetAnalyzerArgs();

    /**
     * Amazon Resource Name (ARN) of the analyzer
     * 
     */
    @Import(name="arn", required=true)
      private final String arn;

    public String getArn() {
        return this.arn;
    }

    public GetAnalyzerArgs(String arn) {
        this.arn = Objects.requireNonNull(arn, "expected parameter 'arn' to be non-null");
    }

    private GetAnalyzerArgs() {
        this.arn = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetAnalyzerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String arn;

        public Builder() {
    	      // Empty
        }

        public Builder(GetAnalyzerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
        }

        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        public GetAnalyzerArgs build() {
            return new GetAnalyzerArgs(arn);
        }
    }
}
