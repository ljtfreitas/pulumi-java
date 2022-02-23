// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.cloudfront.outputs;

import io.pulumi.awsnative.cloudfront.outputs.FunctionConfig;
import io.pulumi.awsnative.cloudfront.outputs.FunctionMetadata;
import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetFunctionResult {
    private final @Nullable String functionARN;
    private final @Nullable FunctionConfig functionConfig;
    private final @Nullable FunctionMetadata functionMetadata;
    private final @Nullable String name;
    private final @Nullable String stage;

    @OutputCustomType.Constructor({"functionARN","functionConfig","functionMetadata","name","stage"})
    private GetFunctionResult(
        @Nullable String functionARN,
        @Nullable FunctionConfig functionConfig,
        @Nullable FunctionMetadata functionMetadata,
        @Nullable String name,
        @Nullable String stage) {
        this.functionARN = functionARN;
        this.functionConfig = functionConfig;
        this.functionMetadata = functionMetadata;
        this.name = name;
        this.stage = stage;
    }

    public Optional<String> getFunctionARN() {
        return Optional.ofNullable(this.functionARN);
    }
    public Optional<FunctionConfig> getFunctionConfig() {
        return Optional.ofNullable(this.functionConfig);
    }
    public Optional<FunctionMetadata> getFunctionMetadata() {
        return Optional.ofNullable(this.functionMetadata);
    }
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    public Optional<String> getStage() {
        return Optional.ofNullable(this.stage);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetFunctionResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String functionARN;
        private @Nullable FunctionConfig functionConfig;
        private @Nullable FunctionMetadata functionMetadata;
        private @Nullable String name;
        private @Nullable String stage;

        public Builder() {
    	      // Empty
        }

        public Builder(GetFunctionResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionARN = defaults.functionARN;
    	      this.functionConfig = defaults.functionConfig;
    	      this.functionMetadata = defaults.functionMetadata;
    	      this.name = defaults.name;
    	      this.stage = defaults.stage;
        }

        public Builder setFunctionARN(@Nullable String functionARN) {
            this.functionARN = functionARN;
            return this;
        }

        public Builder setFunctionConfig(@Nullable FunctionConfig functionConfig) {
            this.functionConfig = functionConfig;
            return this;
        }

        public Builder setFunctionMetadata(@Nullable FunctionMetadata functionMetadata) {
            this.functionMetadata = functionMetadata;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setStage(@Nullable String stage) {
            this.stage = stage;
            return this;
        }
        public GetFunctionResult build() {
            return new GetFunctionResult(functionARN, functionConfig, functionMetadata, name, stage);
        }
    }
}
