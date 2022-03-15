// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>Amazon Athena parameters.</p>
 * 
 */
public final class DataSourceAthenaParameters extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceAthenaParameters Empty = new DataSourceAthenaParameters();

    /**
     * <p>The workgroup that Amazon Athena uses.</p>
     * 
     */
    @Import(name="workGroup")
      private final @Nullable String workGroup;

    public Optional<String> getWorkGroup() {
        return this.workGroup == null ? Optional.empty() : Optional.ofNullable(this.workGroup);
    }

    public DataSourceAthenaParameters(@Nullable String workGroup) {
        this.workGroup = workGroup;
    }

    private DataSourceAthenaParameters() {
        this.workGroup = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceAthenaParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String workGroup;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceAthenaParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.workGroup = defaults.workGroup;
        }

        public Builder workGroup(@Nullable String workGroup) {
            this.workGroup = workGroup;
            return this;
        }
        public DataSourceAthenaParameters build() {
            return new DataSourceAthenaParameters(workGroup);
        }
    }
}
