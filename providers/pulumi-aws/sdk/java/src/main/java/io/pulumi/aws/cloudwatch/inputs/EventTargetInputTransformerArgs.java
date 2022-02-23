// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.aws.cloudwatch.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.internal.annotations.InputImport;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class EventTargetInputTransformerArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventTargetInputTransformerArgs Empty = new EventTargetInputTransformerArgs();

    /**
     * Key value pairs specified in the form of JSONPath (for example, time = $.time)
     * * You can have as many as 100 key-value pairs.
     * * You must use JSON dot notation, not bracket notation.
     * * The keys can't start with "AWS".
     * 
     */
    @InputImport(name="inputPaths")
    private final @Nullable Input<Map<String,String>> inputPaths;

    public Input<Map<String,String>> getInputPaths() {
        return this.inputPaths == null ? Input.empty() : this.inputPaths;
    }

    /**
     * Template to customize data sent to the target. Must be valid JSON. To send a string value, the string value must include double quotes. Values must be escaped for both JSON and the provider, e.g., `"\"Your string goes here.\\nA new line.\""`
     * 
     */
    @InputImport(name="inputTemplate", required=true)
    private final Input<String> inputTemplate;

    public Input<String> getInputTemplate() {
        return this.inputTemplate;
    }

    public EventTargetInputTransformerArgs(
        @Nullable Input<Map<String,String>> inputPaths,
        Input<String> inputTemplate) {
        this.inputPaths = inputPaths;
        this.inputTemplate = Objects.requireNonNull(inputTemplate, "expected parameter 'inputTemplate' to be non-null");
    }

    private EventTargetInputTransformerArgs() {
        this.inputPaths = Input.empty();
        this.inputTemplate = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventTargetInputTransformerArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,String>> inputPaths;
        private Input<String> inputTemplate;

        public Builder() {
    	      // Empty
        }

        public Builder(EventTargetInputTransformerArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.inputPaths = defaults.inputPaths;
    	      this.inputTemplate = defaults.inputTemplate;
        }

        public Builder setInputPaths(@Nullable Input<Map<String,String>> inputPaths) {
            this.inputPaths = inputPaths;
            return this;
        }

        public Builder setInputPaths(@Nullable Map<String,String> inputPaths) {
            this.inputPaths = Input.ofNullable(inputPaths);
            return this;
        }

        public Builder setInputTemplate(Input<String> inputTemplate) {
            this.inputTemplate = Objects.requireNonNull(inputTemplate);
            return this;
        }

        public Builder setInputTemplate(String inputTemplate) {
            this.inputTemplate = Input.of(Objects.requireNonNull(inputTemplate));
            return this;
        }
        public EventTargetInputTransformerArgs build() {
            return new EventTargetInputTransformerArgs(inputPaths, inputTemplate);
        }
    }
}
