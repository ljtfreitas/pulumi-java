// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.Objects;


public final class FunctionConfigArgs extends io.pulumi.resources.ResourceArgs {

    public static final FunctionConfigArgs Empty = new FunctionConfigArgs();

    @InputImport(name="comment", required=true)
        private final Input<String> comment;

    public Input<String> getComment() {
        return this.comment;
    }

    @InputImport(name="runtime", required=true)
        private final Input<String> runtime;

    public Input<String> getRuntime() {
        return this.runtime;
    }

    public FunctionConfigArgs(
        Input<String> comment,
        Input<String> runtime) {
        this.comment = Objects.requireNonNull(comment, "expected parameter 'comment' to be non-null");
        this.runtime = Objects.requireNonNull(runtime, "expected parameter 'runtime' to be non-null");
    }

    private FunctionConfigArgs() {
        this.comment = Input.empty();
        this.runtime = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FunctionConfigArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Input<String> comment;
        private Input<String> runtime;

        public Builder() {
    	      // Empty
        }

        public Builder(FunctionConfigArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.runtime = defaults.runtime;
        }

        public Builder setComment(Input<String> comment) {
            this.comment = Objects.requireNonNull(comment);
            return this;
        }

        public Builder setComment(String comment) {
            this.comment = Input.of(Objects.requireNonNull(comment));
            return this;
        }

        public Builder setRuntime(Input<String> runtime) {
            this.runtime = Objects.requireNonNull(runtime);
            return this;
        }

        public Builder setRuntime(String runtime) {
            this.runtime = Input.of(Objects.requireNonNull(runtime));
            return this;
        }
        public FunctionConfigArgs build() {
            return new FunctionConfigArgs(comment, runtime);
        }
    }
}
