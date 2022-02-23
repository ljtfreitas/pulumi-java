// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudtrail.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class GetFunctionArgs extends io.pulumi.resources.InvokeArgs {

    public static final GetFunctionArgs Empty = new GetFunctionArgs();

    /**
     * Name of the CloudFront function.
     * 
     */
    @InputImport(name="name", required=true)
    private final String name;

    public String getName() {
        return this.name;
    }

    /**
     * The function’s stage, either `DEVELOPMENT` or `LIVE`.
     * 
     */
    @InputImport(name="stage", required=true)
    private final String stage;

    public String getStage() {
        return this.stage;
    }

    public GetFunctionArgs(
        String name,
        String stage) {
        this.name = Objects.requireNonNull(name, "expected parameter 'name' to be non-null");
        this.stage = Objects.requireNonNull(stage, "expected parameter 'stage' to be non-null");
    }

    private GetFunctionArgs() {
        this.name = null;
        this.stage = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String name;
        private String stage;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.stage = defaults.stage;
        }

        public Builder setName(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }

        public Builder setStage(String stage) {
            this.stage = Objects.requireNonNull(stage);
            return this;
        }
        public GetFunctionArgs build() {
            return new GetFunctionArgs(name, stage);
        }
    }
}
