// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.datafactory.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class DataFlowResponseFolder {
    /**
     * The name of the folder that this data flow is in.
     * 
     */
    private final @Nullable String name;

    @OutputCustomType.Constructor({"name"})
    private DataFlowResponseFolder(@Nullable String name) {
        this.name = name;
    }

    /**
     * The name of the folder that this data flow is in.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataFlowResponseFolder defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;

        public Builder() {
    	      // Empty
        }

        public Builder(DataFlowResponseFolder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public DataFlowResponseFolder build() {
            return new DataFlowResponseFolder(name);
        }
    }
}
