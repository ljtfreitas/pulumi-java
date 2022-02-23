// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.sqladmin_v1.inputs;

import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import io.pulumi.googlenative.sqladmin_v1.enums.SqlOutOfDiskReportSqlOutOfDiskState;
import java.lang.Integer;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * This message wraps up the information written by out-of-disk detection job.
 * 
 */
public final class SqlOutOfDiskReportArgs extends io.pulumi.resources.ResourceArgs {

    public static final SqlOutOfDiskReportArgs Empty = new SqlOutOfDiskReportArgs();

    /**
     * The minimum recommended increase size in GigaBytes This field is consumed by the frontend * Writers: * the proactive database wellness job for OOD. * Readers:
     * 
     */
    @InputImport(name="sqlMinRecommendedIncreaseSizeGb")
      private final @Nullable Input<Integer> sqlMinRecommendedIncreaseSizeGb;

    public Input<Integer> getSqlMinRecommendedIncreaseSizeGb() {
        return this.sqlMinRecommendedIncreaseSizeGb == null ? Input.empty() : this.sqlMinRecommendedIncreaseSizeGb;
    }

    /**
     * This field represents the state generated by the proactive database wellness job for OutOfDisk issues. * Writers: * the proactive database wellness job for OOD. * Readers: * the proactive database wellness job
     * 
     */
    @InputImport(name="sqlOutOfDiskState")
      private final @Nullable Input<SqlOutOfDiskReportSqlOutOfDiskState> sqlOutOfDiskState;

    public Input<SqlOutOfDiskReportSqlOutOfDiskState> getSqlOutOfDiskState() {
        return this.sqlOutOfDiskState == null ? Input.empty() : this.sqlOutOfDiskState;
    }

    public SqlOutOfDiskReportArgs(
        @Nullable Input<Integer> sqlMinRecommendedIncreaseSizeGb,
        @Nullable Input<SqlOutOfDiskReportSqlOutOfDiskState> sqlOutOfDiskState) {
        this.sqlMinRecommendedIncreaseSizeGb = sqlMinRecommendedIncreaseSizeGb;
        this.sqlOutOfDiskState = sqlOutOfDiskState;
    }

    private SqlOutOfDiskReportArgs() {
        this.sqlMinRecommendedIncreaseSizeGb = Input.empty();
        this.sqlOutOfDiskState = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SqlOutOfDiskReportArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Integer> sqlMinRecommendedIncreaseSizeGb;
        private @Nullable Input<SqlOutOfDiskReportSqlOutOfDiskState> sqlOutOfDiskState;

        public Builder() {
    	      // Empty
        }

        public Builder(SqlOutOfDiskReportArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.sqlMinRecommendedIncreaseSizeGb = defaults.sqlMinRecommendedIncreaseSizeGb;
    	      this.sqlOutOfDiskState = defaults.sqlOutOfDiskState;
        }

        public Builder setSqlMinRecommendedIncreaseSizeGb(@Nullable Input<Integer> sqlMinRecommendedIncreaseSizeGb) {
            this.sqlMinRecommendedIncreaseSizeGb = sqlMinRecommendedIncreaseSizeGb;
            return this;
        }

        public Builder setSqlMinRecommendedIncreaseSizeGb(@Nullable Integer sqlMinRecommendedIncreaseSizeGb) {
            this.sqlMinRecommendedIncreaseSizeGb = Input.ofNullable(sqlMinRecommendedIncreaseSizeGb);
            return this;
        }

        public Builder setSqlOutOfDiskState(@Nullable Input<SqlOutOfDiskReportSqlOutOfDiskState> sqlOutOfDiskState) {
            this.sqlOutOfDiskState = sqlOutOfDiskState;
            return this;
        }

        public Builder setSqlOutOfDiskState(@Nullable SqlOutOfDiskReportSqlOutOfDiskState sqlOutOfDiskState) {
            this.sqlOutOfDiskState = Input.ofNullable(sqlOutOfDiskState);
            return this;
        }
        public SqlOutOfDiskReportArgs build() {
            return new SqlOutOfDiskReportArgs(sqlMinRecommendedIncreaseSizeGb, sqlOutOfDiskState);
        }
    }
}
