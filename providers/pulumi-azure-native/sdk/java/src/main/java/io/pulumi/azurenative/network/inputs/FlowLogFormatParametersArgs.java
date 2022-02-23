// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.network.inputs;

import io.pulumi.azurenative.network.enums.FlowLogFormatType;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Parameters that define the flow log format.
 * 
 */
public final class FlowLogFormatParametersArgs extends io.pulumi.resources.ResourceArgs {

    public static final FlowLogFormatParametersArgs Empty = new FlowLogFormatParametersArgs();

    /**
     * The file type of flow log.
     * 
     */
    @InputImport(name="type")
        private final @Nullable Input<Either<String,FlowLogFormatType>> type;

    public Input<Either<String,FlowLogFormatType>> getType() {
        return this.type == null ? Input.empty() : this.type;
    }

    /**
     * The version (revision) of the flow log.
     * 
     */
    @InputImport(name="version")
        private final @Nullable Input<Integer> version;

    public Input<Integer> getVersion() {
        return this.version == null ? Input.empty() : this.version;
    }

    public FlowLogFormatParametersArgs(
        @Nullable Input<Either<String,FlowLogFormatType>> type,
        @Nullable Input<Integer> version) {
        this.type = type;
        this.version = version == null ? Input.ofNullable(0) : version;
    }

    private FlowLogFormatParametersArgs() {
        this.type = Input.empty();
        this.version = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowLogFormatParametersArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Either<String,FlowLogFormatType>> type;
        private @Nullable Input<Integer> version;

        public Builder() {
    	      // Empty
        }

        public Builder(FlowLogFormatParametersArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
    	      this.version = defaults.version;
        }

        public Builder setType(@Nullable Input<Either<String,FlowLogFormatType>> type) {
            this.type = type;
            return this;
        }

        public Builder setType(@Nullable Either<String,FlowLogFormatType> type) {
            this.type = Input.ofNullable(type);
            return this;
        }

        public Builder setVersion(@Nullable Input<Integer> version) {
            this.version = version;
            return this;
        }

        public Builder setVersion(@Nullable Integer version) {
            this.version = Input.ofNullable(version);
            return this;
        }
        public FlowLogFormatParametersArgs build() {
            return new FlowLogFormatParametersArgs(type, version);
        }
    }
}
