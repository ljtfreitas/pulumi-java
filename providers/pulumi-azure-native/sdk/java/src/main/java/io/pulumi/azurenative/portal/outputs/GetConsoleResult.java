// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.portal.outputs;

import io.pulumi.azurenative.portal.outputs.ConsolePropertiesResponse;
import io.pulumi.core.annotations.OutputCustomType;
import java.util.Objects;

@OutputCustomType
public final class GetConsoleResult {
    /**
     * Cloud shell console properties.
     * 
     */
    private final ConsolePropertiesResponse properties;

    @OutputCustomType.Constructor({"properties"})
    private GetConsoleResult(ConsolePropertiesResponse properties) {
        this.properties = Objects.requireNonNull(properties);
    }

    /**
     * Cloud shell console properties.
     * 
     */
    public ConsolePropertiesResponse getProperties() {
        return this.properties;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetConsoleResult defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConsolePropertiesResponse properties;

        public Builder() {
    	      // Empty
        }

        public Builder(GetConsoleResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.properties = defaults.properties;
        }

        public Builder setProperties(ConsolePropertiesResponse properties) {
            this.properties = Objects.requireNonNull(properties);
            return this;
        }
        public GetConsoleResult build() {
            return new GetConsoleResult(properties);
        }
    }
}
