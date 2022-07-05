// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.datastream.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.datastream.v1.outputs.MysqlSourceConfigResponse;
import com.pulumi.googlenative.datastream.v1.outputs.OracleSourceConfigResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class SourceConfigResponse {
    /**
     * @return MySQL data source configuration.
     * 
     */
    private final MysqlSourceConfigResponse mysqlSourceConfig;
    /**
     * @return Oracle data source configuration.
     * 
     */
    private final OracleSourceConfigResponse oracleSourceConfig;
    /**
     * @return Source connection profile resoource. Format: `projects/{project}/locations/{location}/connectionProfiles/{name}`
     * 
     */
    private final String sourceConnectionProfile;

    @CustomType.Constructor
    private SourceConfigResponse(
        @CustomType.Parameter("mysqlSourceConfig") MysqlSourceConfigResponse mysqlSourceConfig,
        @CustomType.Parameter("oracleSourceConfig") OracleSourceConfigResponse oracleSourceConfig,
        @CustomType.Parameter("sourceConnectionProfile") String sourceConnectionProfile) {
        this.mysqlSourceConfig = mysqlSourceConfig;
        this.oracleSourceConfig = oracleSourceConfig;
        this.sourceConnectionProfile = sourceConnectionProfile;
    }

    /**
     * @return MySQL data source configuration.
     * 
     */
    public MysqlSourceConfigResponse mysqlSourceConfig() {
        return this.mysqlSourceConfig;
    }
    /**
     * @return Oracle data source configuration.
     * 
     */
    public OracleSourceConfigResponse oracleSourceConfig() {
        return this.oracleSourceConfig;
    }
    /**
     * @return Source connection profile resoource. Format: `projects/{project}/locations/{location}/connectionProfiles/{name}`
     * 
     */
    public String sourceConnectionProfile() {
        return this.sourceConnectionProfile;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SourceConfigResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private MysqlSourceConfigResponse mysqlSourceConfig;
        private OracleSourceConfigResponse oracleSourceConfig;
        private String sourceConnectionProfile;

        public Builder() {
    	      // Empty
        }

        public Builder(SourceConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.mysqlSourceConfig = defaults.mysqlSourceConfig;
    	      this.oracleSourceConfig = defaults.oracleSourceConfig;
    	      this.sourceConnectionProfile = defaults.sourceConnectionProfile;
        }

        public Builder mysqlSourceConfig(MysqlSourceConfigResponse mysqlSourceConfig) {
            this.mysqlSourceConfig = Objects.requireNonNull(mysqlSourceConfig);
            return this;
        }
        public Builder oracleSourceConfig(OracleSourceConfigResponse oracleSourceConfig) {
            this.oracleSourceConfig = Objects.requireNonNull(oracleSourceConfig);
            return this;
        }
        public Builder sourceConnectionProfile(String sourceConnectionProfile) {
            this.sourceConnectionProfile = Objects.requireNonNull(sourceConnectionProfile);
            return this;
        }        public SourceConfigResponse build() {
            return new SourceConfigResponse(mysqlSourceConfig, oracleSourceConfig, sourceConnectionProfile);
        }
    }
}
