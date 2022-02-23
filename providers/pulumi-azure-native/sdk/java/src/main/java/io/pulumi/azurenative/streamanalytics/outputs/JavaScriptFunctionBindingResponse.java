// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.streamanalytics.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class JavaScriptFunctionBindingResponse {
    /**
     * The JavaScript code containing a single function definition. For example: 'function (x, y) { return x + y; }'
     * 
     */
    private final @Nullable String script;
    /**
     * Indicates the function binding type.
     * Expected value is 'Microsoft.StreamAnalytics/JavascriptUdf'.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"script","type"})
    private JavaScriptFunctionBindingResponse(
        @Nullable String script,
        String type) {
        this.script = script;
        this.type = Objects.requireNonNull(type);
    }

    /**
     * The JavaScript code containing a single function definition. For example: 'function (x, y) { return x + y; }'
     * 
     */
    public Optional<String> getScript() {
        return Optional.ofNullable(this.script);
    }
    /**
     * Indicates the function binding type.
     * Expected value is 'Microsoft.StreamAnalytics/JavascriptUdf'.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(JavaScriptFunctionBindingResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String script;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(JavaScriptFunctionBindingResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.script = defaults.script;
    	      this.type = defaults.type;
        }

        public Builder setScript(@Nullable String script) {
            this.script = script;
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public JavaScriptFunctionBindingResponse build() {
            return new JavaScriptFunctionBindingResponse(script, type);
        }
    }
}
