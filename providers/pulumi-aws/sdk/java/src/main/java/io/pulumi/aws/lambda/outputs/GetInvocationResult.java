// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.lambda.outputs;

import io.pulumi.core.internal.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class GetInvocationResult {
    private final String functionName;
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    private final String id;
    private final String input;
    private final @Nullable String qualifier;
    /**
     * String result of the lambda function invocation.
     * 
     */
    private final String result;

    @OutputCustomType.Constructor({"functionName","id","input","qualifier","result"})
    private GetInvocationResult(
        String functionName,
        String id,
        String input,
        @Nullable String qualifier,
        String result) {
        this.functionName = Objects.requireNonNull(functionName);
        this.id = Objects.requireNonNull(id);
        this.input = Objects.requireNonNull(input);
        this.qualifier = qualifier;
        this.result = Objects.requireNonNull(result);
    }

    public String getFunctionName() {
        return this.functionName;
    }
    /**
     * The provider-assigned unique ID for this managed resource.
     * 
     */
    public String getId() {
        return this.id;
    }
    public String getInput() {
        return this.input;
    }
    public Optional<String> getQualifier() {
        return Optional.ofNullable(this.qualifier);
    }
    /**
     * String result of the lambda function invocation.
     * 
     */
    public String getResult() {
        return this.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInvocationResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String functionName;
        private String id;
        private String input;
        private @Nullable String qualifier;
        private String result;

        public Builder() {
    	      // Empty
        }

        public Builder(GetInvocationResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.functionName = defaults.functionName;
    	      this.id = defaults.id;
    	      this.input = defaults.input;
    	      this.qualifier = defaults.qualifier;
    	      this.result = defaults.result;
        }

        public Builder setFunctionName(String functionName) {
            this.functionName = Objects.requireNonNull(functionName);
            return this;
        }

        public Builder setId(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }

        public Builder setInput(String input) {
            this.input = Objects.requireNonNull(input);
            return this;
        }

        public Builder setQualifier(@Nullable String qualifier) {
            this.qualifier = qualifier;
            return this;
        }

        public Builder setResult(String result) {
            this.result = Objects.requireNonNull(result);
            return this;
        }
        public GetInvocationResult build() {
            return new GetInvocationResult(functionName, id, input, qualifier, result);
        }
    }
}
