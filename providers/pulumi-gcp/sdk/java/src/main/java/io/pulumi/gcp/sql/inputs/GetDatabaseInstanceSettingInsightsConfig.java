// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.sql.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Boolean;
import java.lang.Integer;
import java.util.Objects;


public final class GetDatabaseInstanceSettingInsightsConfig extends io.pulumi.resources.InvokeArgs {

    public static final GetDatabaseInstanceSettingInsightsConfig Empty = new GetDatabaseInstanceSettingInsightsConfig();

    @InputImport(name="queryInsightsEnabled", required=true)
        private final Boolean queryInsightsEnabled;

    public Boolean getQueryInsightsEnabled() {
        return this.queryInsightsEnabled;
    }

    @InputImport(name="queryStringLength", required=true)
        private final Integer queryStringLength;

    public Integer getQueryStringLength() {
        return this.queryStringLength;
    }

    @InputImport(name="recordApplicationTags", required=true)
        private final Boolean recordApplicationTags;

    public Boolean getRecordApplicationTags() {
        return this.recordApplicationTags;
    }

    @InputImport(name="recordClientAddress", required=true)
        private final Boolean recordClientAddress;

    public Boolean getRecordClientAddress() {
        return this.recordClientAddress;
    }

    public GetDatabaseInstanceSettingInsightsConfig(
        Boolean queryInsightsEnabled,
        Integer queryStringLength,
        Boolean recordApplicationTags,
        Boolean recordClientAddress) {
        this.queryInsightsEnabled = Objects.requireNonNull(queryInsightsEnabled, "expected parameter 'queryInsightsEnabled' to be non-null");
        this.queryStringLength = Objects.requireNonNull(queryStringLength, "expected parameter 'queryStringLength' to be non-null");
        this.recordApplicationTags = Objects.requireNonNull(recordApplicationTags, "expected parameter 'recordApplicationTags' to be non-null");
        this.recordClientAddress = Objects.requireNonNull(recordClientAddress, "expected parameter 'recordClientAddress' to be non-null");
    }

    private GetDatabaseInstanceSettingInsightsConfig() {
        this.queryInsightsEnabled = null;
        this.queryStringLength = null;
        this.recordApplicationTags = null;
        this.recordClientAddress = null;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetDatabaseInstanceSettingInsightsConfig defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Boolean queryInsightsEnabled;
        private Integer queryStringLength;
        private Boolean recordApplicationTags;
        private Boolean recordClientAddress;

        public Builder() {
    	      // Empty
        }

        public Builder(GetDatabaseInstanceSettingInsightsConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.queryInsightsEnabled = defaults.queryInsightsEnabled;
    	      this.queryStringLength = defaults.queryStringLength;
    	      this.recordApplicationTags = defaults.recordApplicationTags;
    	      this.recordClientAddress = defaults.recordClientAddress;
        }

        public Builder setQueryInsightsEnabled(Boolean queryInsightsEnabled) {
            this.queryInsightsEnabled = Objects.requireNonNull(queryInsightsEnabled);
            return this;
        }

        public Builder setQueryStringLength(Integer queryStringLength) {
            this.queryStringLength = Objects.requireNonNull(queryStringLength);
            return this;
        }

        public Builder setRecordApplicationTags(Boolean recordApplicationTags) {
            this.recordApplicationTags = Objects.requireNonNull(recordApplicationTags);
            return this;
        }

        public Builder setRecordClientAddress(Boolean recordClientAddress) {
            this.recordClientAddress = Objects.requireNonNull(recordClientAddress);
            return this;
        }
        public GetDatabaseInstanceSettingInsightsConfig build() {
            return new GetDatabaseInstanceSettingInsightsConfig(queryInsightsEnabled, queryStringLength, recordApplicationTags, recordClientAddress);
        }
    }
}
