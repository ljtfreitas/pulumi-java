// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Parameters that define the flow log format.
 * 
 */
public final class FlowLogFormatParametersResponse extends io.pulumi.resources.InvokeArgs {

    public static final FlowLogFormatParametersResponse Empty = new FlowLogFormatParametersResponse();

    /**
     * The file type of flow log.
     * 
     */
    @InputImport(name="type")
        private final @Nullable String type;

    public Optional<String> getType() {
        return this.type == null ? Optional.empty() : Optional.ofNullable(this.type);
    }

    /**
     * The version (revision) of the flow log.
     * 
     */
    @InputImport(name="version")
        private final @Nullable Integer version;

    public Optional<Integer> getVersion() {
        return this.version == null ? Optional.empty() : Optional.ofNullable(this.version);
    }

    public FlowLogFormatParametersResponse(
        @Nullable String type,
        @Nullable Integer version) {
        this.type = type;
        this.version = version == null ? 0 : version;
    }

    private FlowLogFormatParametersResponse() {
        this.type = null;
        this.version = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowLogFormatParametersResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String type;
        private @Nullable Integer version;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowLogFormatParametersResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setType(@Nullable String type) {
            this.type = type;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = version;
            return this;
        }
        public FlowLogFormatParametersResponse build() {
            return new FlowLogFormatParametersResponse(type, version);
        }
    }
}
