// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.awsnative.quicksight.inputs;

import io.pulumi.awsnative.quicksight.inputs.DataSourceAmazonElasticsearchParameters;
import io.pulumi.awsnative.quicksight.inputs.DataSourceAmazonOpenSearchParameters;
import io.pulumi.awsnative.quicksight.inputs.DataSourceAthenaParameters;
import io.pulumi.awsnative.quicksight.inputs.DataSourceAuroraParameters;
import io.pulumi.awsnative.quicksight.inputs.DataSourceAuroraPostgreSqlParameters;
import io.pulumi.awsnative.quicksight.inputs.DataSourceMariaDbParameters;
import io.pulumi.awsnative.quicksight.inputs.DataSourceMySqlParameters;
import io.pulumi.awsnative.quicksight.inputs.DataSourceOracleParameters;
import io.pulumi.awsnative.quicksight.inputs.DataSourcePostgreSqlParameters;
import io.pulumi.awsnative.quicksight.inputs.DataSourcePrestoParameters;
import io.pulumi.awsnative.quicksight.inputs.DataSourceRdsParameters;
import io.pulumi.awsnative.quicksight.inputs.DataSourceRedshiftParameters;
import io.pulumi.awsnative.quicksight.inputs.DataSourceS3Parameters;
import io.pulumi.awsnative.quicksight.inputs.DataSourceSnowflakeParameters;
import io.pulumi.awsnative.quicksight.inputs.DataSourceSparkParameters;
import io.pulumi.awsnative.quicksight.inputs.DataSourceSqlServerParameters;
import io.pulumi.awsnative.quicksight.inputs.DataSourceTeradataParameters;
import io.pulumi.core.annotations.Import;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * <p>The parameters that Amazon QuickSight uses to connect to your underlying data source.
 *             This is a variant type structure. For this structure to be valid, only one of the
 *             attributes can be non-null.</p>
 * 
 */
public final class DataSourceParameters extends io.pulumi.resources.InvokeArgs {

    public static final DataSourceParameters Empty = new DataSourceParameters();

    @Import(name="amazonElasticsearchParameters")
      private final @Nullable DataSourceAmazonElasticsearchParameters amazonElasticsearchParameters;

    public Optional<DataSourceAmazonElasticsearchParameters> getAmazonElasticsearchParameters() {
        return this.amazonElasticsearchParameters == null ? Optional.empty() : Optional.ofNullable(this.amazonElasticsearchParameters);
    }

    @Import(name="amazonOpenSearchParameters")
      private final @Nullable DataSourceAmazonOpenSearchParameters amazonOpenSearchParameters;

    public Optional<DataSourceAmazonOpenSearchParameters> getAmazonOpenSearchParameters() {
        return this.amazonOpenSearchParameters == null ? Optional.empty() : Optional.ofNullable(this.amazonOpenSearchParameters);
    }

    @Import(name="athenaParameters")
      private final @Nullable DataSourceAthenaParameters athenaParameters;

    public Optional<DataSourceAthenaParameters> getAthenaParameters() {
        return this.athenaParameters == null ? Optional.empty() : Optional.ofNullable(this.athenaParameters);
    }

    @Import(name="auroraParameters")
      private final @Nullable DataSourceAuroraParameters auroraParameters;

    public Optional<DataSourceAuroraParameters> getAuroraParameters() {
        return this.auroraParameters == null ? Optional.empty() : Optional.ofNullable(this.auroraParameters);
    }

    @Import(name="auroraPostgreSqlParameters")
      private final @Nullable DataSourceAuroraPostgreSqlParameters auroraPostgreSqlParameters;

    public Optional<DataSourceAuroraPostgreSqlParameters> getAuroraPostgreSqlParameters() {
        return this.auroraPostgreSqlParameters == null ? Optional.empty() : Optional.ofNullable(this.auroraPostgreSqlParameters);
    }

    @Import(name="mariaDbParameters")
      private final @Nullable DataSourceMariaDbParameters mariaDbParameters;

    public Optional<DataSourceMariaDbParameters> getMariaDbParameters() {
        return this.mariaDbParameters == null ? Optional.empty() : Optional.ofNullable(this.mariaDbParameters);
    }

    @Import(name="mySqlParameters")
      private final @Nullable DataSourceMySqlParameters mySqlParameters;

    public Optional<DataSourceMySqlParameters> getMySqlParameters() {
        return this.mySqlParameters == null ? Optional.empty() : Optional.ofNullable(this.mySqlParameters);
    }

    @Import(name="oracleParameters")
      private final @Nullable DataSourceOracleParameters oracleParameters;

    public Optional<DataSourceOracleParameters> getOracleParameters() {
        return this.oracleParameters == null ? Optional.empty() : Optional.ofNullable(this.oracleParameters);
    }

    @Import(name="postgreSqlParameters")
      private final @Nullable DataSourcePostgreSqlParameters postgreSqlParameters;

    public Optional<DataSourcePostgreSqlParameters> getPostgreSqlParameters() {
        return this.postgreSqlParameters == null ? Optional.empty() : Optional.ofNullable(this.postgreSqlParameters);
    }

    @Import(name="prestoParameters")
      private final @Nullable DataSourcePrestoParameters prestoParameters;

    public Optional<DataSourcePrestoParameters> getPrestoParameters() {
        return this.prestoParameters == null ? Optional.empty() : Optional.ofNullable(this.prestoParameters);
    }

    @Import(name="rdsParameters")
      private final @Nullable DataSourceRdsParameters rdsParameters;

    public Optional<DataSourceRdsParameters> getRdsParameters() {
        return this.rdsParameters == null ? Optional.empty() : Optional.ofNullable(this.rdsParameters);
    }

    @Import(name="redshiftParameters")
      private final @Nullable DataSourceRedshiftParameters redshiftParameters;

    public Optional<DataSourceRedshiftParameters> getRedshiftParameters() {
        return this.redshiftParameters == null ? Optional.empty() : Optional.ofNullable(this.redshiftParameters);
    }

    @Import(name="s3Parameters")
      private final @Nullable DataSourceS3Parameters s3Parameters;

    public Optional<DataSourceS3Parameters> getS3Parameters() {
        return this.s3Parameters == null ? Optional.empty() : Optional.ofNullable(this.s3Parameters);
    }

    @Import(name="snowflakeParameters")
      private final @Nullable DataSourceSnowflakeParameters snowflakeParameters;

    public Optional<DataSourceSnowflakeParameters> getSnowflakeParameters() {
        return this.snowflakeParameters == null ? Optional.empty() : Optional.ofNullable(this.snowflakeParameters);
    }

    @Import(name="sparkParameters")
      private final @Nullable DataSourceSparkParameters sparkParameters;

    public Optional<DataSourceSparkParameters> getSparkParameters() {
        return this.sparkParameters == null ? Optional.empty() : Optional.ofNullable(this.sparkParameters);
    }

    @Import(name="sqlServerParameters")
      private final @Nullable DataSourceSqlServerParameters sqlServerParameters;

    public Optional<DataSourceSqlServerParameters> getSqlServerParameters() {
        return this.sqlServerParameters == null ? Optional.empty() : Optional.ofNullable(this.sqlServerParameters);
    }

    @Import(name="teradataParameters")
      private final @Nullable DataSourceTeradataParameters teradataParameters;

    public Optional<DataSourceTeradataParameters> getTeradataParameters() {
        return this.teradataParameters == null ? Optional.empty() : Optional.ofNullable(this.teradataParameters);
    }

    public DataSourceParameters(
        @Nullable DataSourceAmazonElasticsearchParameters amazonElasticsearchParameters,
        @Nullable DataSourceAmazonOpenSearchParameters amazonOpenSearchParameters,
        @Nullable DataSourceAthenaParameters athenaParameters,
        @Nullable DataSourceAuroraParameters auroraParameters,
        @Nullable DataSourceAuroraPostgreSqlParameters auroraPostgreSqlParameters,
        @Nullable DataSourceMariaDbParameters mariaDbParameters,
        @Nullable DataSourceMySqlParameters mySqlParameters,
        @Nullable DataSourceOracleParameters oracleParameters,
        @Nullable DataSourcePostgreSqlParameters postgreSqlParameters,
        @Nullable DataSourcePrestoParameters prestoParameters,
        @Nullable DataSourceRdsParameters rdsParameters,
        @Nullable DataSourceRedshiftParameters redshiftParameters,
        @Nullable DataSourceS3Parameters s3Parameters,
        @Nullable DataSourceSnowflakeParameters snowflakeParameters,
        @Nullable DataSourceSparkParameters sparkParameters,
        @Nullable DataSourceSqlServerParameters sqlServerParameters,
        @Nullable DataSourceTeradataParameters teradataParameters) {
        this.amazonElasticsearchParameters = amazonElasticsearchParameters;
        this.amazonOpenSearchParameters = amazonOpenSearchParameters;
        this.athenaParameters = athenaParameters;
        this.auroraParameters = auroraParameters;
        this.auroraPostgreSqlParameters = auroraPostgreSqlParameters;
        this.mariaDbParameters = mariaDbParameters;
        this.mySqlParameters = mySqlParameters;
        this.oracleParameters = oracleParameters;
        this.postgreSqlParameters = postgreSqlParameters;
        this.prestoParameters = prestoParameters;
        this.rdsParameters = rdsParameters;
        this.redshiftParameters = redshiftParameters;
        this.s3Parameters = s3Parameters;
        this.snowflakeParameters = snowflakeParameters;
        this.sparkParameters = sparkParameters;
        this.sqlServerParameters = sqlServerParameters;
        this.teradataParameters = teradataParameters;
    }

    private DataSourceParameters() {
        this.amazonElasticsearchParameters = null;
        this.amazonOpenSearchParameters = null;
        this.athenaParameters = null;
        this.auroraParameters = null;
        this.auroraPostgreSqlParameters = null;
        this.mariaDbParameters = null;
        this.mySqlParameters = null;
        this.oracleParameters = null;
        this.postgreSqlParameters = null;
        this.prestoParameters = null;
        this.rdsParameters = null;
        this.redshiftParameters = null;
        this.s3Parameters = null;
        this.snowflakeParameters = null;
        this.sparkParameters = null;
        this.sqlServerParameters = null;
        this.teradataParameters = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DataSourceParameters defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable DataSourceAmazonElasticsearchParameters amazonElasticsearchParameters;
        private @Nullable DataSourceAmazonOpenSearchParameters amazonOpenSearchParameters;
        private @Nullable DataSourceAthenaParameters athenaParameters;
        private @Nullable DataSourceAuroraParameters auroraParameters;
        private @Nullable DataSourceAuroraPostgreSqlParameters auroraPostgreSqlParameters;
        private @Nullable DataSourceMariaDbParameters mariaDbParameters;
        private @Nullable DataSourceMySqlParameters mySqlParameters;
        private @Nullable DataSourceOracleParameters oracleParameters;
        private @Nullable DataSourcePostgreSqlParameters postgreSqlParameters;
        private @Nullable DataSourcePrestoParameters prestoParameters;
        private @Nullable DataSourceRdsParameters rdsParameters;
        private @Nullable DataSourceRedshiftParameters redshiftParameters;
        private @Nullable DataSourceS3Parameters s3Parameters;
        private @Nullable DataSourceSnowflakeParameters snowflakeParameters;
        private @Nullable DataSourceSparkParameters sparkParameters;
        private @Nullable DataSourceSqlServerParameters sqlServerParameters;
        private @Nullable DataSourceTeradataParameters teradataParameters;

        public Builder() {
    	      // Empty
        }

        public Builder(DataSourceParameters defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.amazonElasticsearchParameters = defaults.amazonElasticsearchParameters;
    	      this.amazonOpenSearchParameters = defaults.amazonOpenSearchParameters;
    	      this.athenaParameters = defaults.athenaParameters;
    	      this.auroraParameters = defaults.auroraParameters;
    	      this.auroraPostgreSqlParameters = defaults.auroraPostgreSqlParameters;
    	      this.mariaDbParameters = defaults.mariaDbParameters;
    	      this.mySqlParameters = defaults.mySqlParameters;
    	      this.oracleParameters = defaults.oracleParameters;
    	      this.postgreSqlParameters = defaults.postgreSqlParameters;
    	      this.prestoParameters = defaults.prestoParameters;
    	      this.rdsParameters = defaults.rdsParameters;
    	      this.redshiftParameters = defaults.redshiftParameters;
    	      this.s3Parameters = defaults.s3Parameters;
    	      this.snowflakeParameters = defaults.snowflakeParameters;
    	      this.sparkParameters = defaults.sparkParameters;
    	      this.sqlServerParameters = defaults.sqlServerParameters;
    	      this.teradataParameters = defaults.teradataParameters;
        }

        public Builder amazonElasticsearchParameters(@Nullable DataSourceAmazonElasticsearchParameters amazonElasticsearchParameters) {
            this.amazonElasticsearchParameters = amazonElasticsearchParameters;
            return this;
        }

        public Builder amazonOpenSearchParameters(@Nullable DataSourceAmazonOpenSearchParameters amazonOpenSearchParameters) {
            this.amazonOpenSearchParameters = amazonOpenSearchParameters;
            return this;
        }

        public Builder athenaParameters(@Nullable DataSourceAthenaParameters athenaParameters) {
            this.athenaParameters = athenaParameters;
            return this;
        }

        public Builder auroraParameters(@Nullable DataSourceAuroraParameters auroraParameters) {
            this.auroraParameters = auroraParameters;
            return this;
        }

        public Builder auroraPostgreSqlParameters(@Nullable DataSourceAuroraPostgreSqlParameters auroraPostgreSqlParameters) {
            this.auroraPostgreSqlParameters = auroraPostgreSqlParameters;
            return this;
        }

        public Builder mariaDbParameters(@Nullable DataSourceMariaDbParameters mariaDbParameters) {
            this.mariaDbParameters = mariaDbParameters;
            return this;
        }

        public Builder mySqlParameters(@Nullable DataSourceMySqlParameters mySqlParameters) {
            this.mySqlParameters = mySqlParameters;
            return this;
        }

        public Builder oracleParameters(@Nullable DataSourceOracleParameters oracleParameters) {
            this.oracleParameters = oracleParameters;
            return this;
        }

        public Builder postgreSqlParameters(@Nullable DataSourcePostgreSqlParameters postgreSqlParameters) {
            this.postgreSqlParameters = postgreSqlParameters;
            return this;
        }

        public Builder prestoParameters(@Nullable DataSourcePrestoParameters prestoParameters) {
            this.prestoParameters = prestoParameters;
            return this;
        }

        public Builder rdsParameters(@Nullable DataSourceRdsParameters rdsParameters) {
            this.rdsParameters = rdsParameters;
            return this;
        }

        public Builder redshiftParameters(@Nullable DataSourceRedshiftParameters redshiftParameters) {
            this.redshiftParameters = redshiftParameters;
            return this;
        }

        public Builder s3Parameters(@Nullable DataSourceS3Parameters s3Parameters) {
            this.s3Parameters = s3Parameters;
            return this;
        }

        public Builder snowflakeParameters(@Nullable DataSourceSnowflakeParameters snowflakeParameters) {
            this.snowflakeParameters = snowflakeParameters;
            return this;
        }

        public Builder sparkParameters(@Nullable DataSourceSparkParameters sparkParameters) {
            this.sparkParameters = sparkParameters;
            return this;
        }

        public Builder sqlServerParameters(@Nullable DataSourceSqlServerParameters sqlServerParameters) {
            this.sqlServerParameters = sqlServerParameters;
            return this;
        }

        public Builder teradataParameters(@Nullable DataSourceTeradataParameters teradataParameters) {
            this.teradataParameters = teradataParameters;
            return this;
        }
        public DataSourceParameters build() {
            return new DataSourceParameters(amazonElasticsearchParameters, amazonOpenSearchParameters, athenaParameters, auroraParameters, auroraPostgreSqlParameters, mariaDbParameters, mySqlParameters, oracleParameters, postgreSqlParameters, prestoParameters, rdsParameters, redshiftParameters, s3Parameters, snowflakeParameters, sparkParameters, sqlServerParameters, teradataParameters);
        }
    }
}
