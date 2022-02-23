// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.gameservices_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.gameservices_v1.enums.DataAccessOptionsLogMode;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Write a Data Access (Gin) log
 * 
 */
public final class DataAccessOptionsArgs extends io.pulumi.resources.ResourceArgs {

    public static final DataAccessOptionsArgs Empty = new DataAccessOptionsArgs();

    @InputImport(name="logMode")
      private final @Nullable Input<DataAccessOptionsLogMode> logMode;

    public Input<DataAccessOptionsLogMode> getLogMode() {
        return this.logMode == null ? Input.empty() : this.logMode;
    }

    public DataAccessOptionsArgs(@Nullable Input<DataAccessOptionsLogMode> logMode) {
        this.logMode = logMode;
    }

    private DataAccessOptionsArgs() {
        this.logMode = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataAccessOptionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<DataAccessOptionsLogMode> logMode;

        public Builder() {
    	      // Empty
        }

        public Builder(DataAccessOptionsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.logMode = defaults.logMode;
        }

        public Builder setLogMode(@Nullable Input<DataAccessOptionsLogMode> logMode) {
            this.logMode = logMode;
            return this;
        }

        public Builder setLogMode(@Nullable DataAccessOptionsLogMode logMode) {
            this.logMode = Input.ofNullable(logMode);
            return this;
        }
        public DataAccessOptionsArgs build() {
            return new DataAccessOptionsArgs(logMode);
        }
    }
}
