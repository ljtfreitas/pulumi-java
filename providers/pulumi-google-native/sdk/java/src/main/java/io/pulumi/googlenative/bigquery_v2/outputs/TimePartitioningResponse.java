// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.googlenative.bigquery_v2.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;

@OutputCustomType
public final class TimePartitioningResponse {
    /**
     * [Optional] Number of milliseconds for which to keep the storage for partitions in the table. The storage in a partition will have an expiration time of its partition time plus this value.
     * 
     */
    private final String expirationMs;
    /**
     * [Beta] [Optional] If not set, the table is partitioned by pseudo column, referenced via either '_PARTITIONTIME' as TIMESTAMP type, or '_PARTITIONDATE' as DATE type. If field is specified, the table is instead partitioned by this field. The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
     * 
     */
    private final String field;
    private final Boolean requirePartitionFilter;
    /**
     * [Required] The supported types are DAY, HOUR, MONTH, and YEAR, which will generate one partition per day, hour, month, and year, respectively. When the type is not specified, the default behavior is DAY.
     * 
     */
    private final String type;

    @OutputCustomType.Constructor({"expirationMs","field","requirePartitionFilter","type"})
    private TimePartitioningResponse(
        String expirationMs,
        String field,
        Boolean requirePartitionFilter,
        String type) {
        this.expirationMs = Objects.requireNonNull(expirationMs);
        this.field = Objects.requireNonNull(field);
        this.requirePartitionFilter = Objects.requireNonNull(requirePartitionFilter);
        this.type = Objects.requireNonNull(type);
    }

    /**
     * [Optional] Number of milliseconds for which to keep the storage for partitions in the table. The storage in a partition will have an expiration time of its partition time plus this value.
     * 
     */
    public String getExpirationMs() {
        return this.expirationMs;
    }
    /**
     * [Beta] [Optional] If not set, the table is partitioned by pseudo column, referenced via either '_PARTITIONTIME' as TIMESTAMP type, or '_PARTITIONDATE' as DATE type. If field is specified, the table is instead partitioned by this field. The field must be a top-level TIMESTAMP or DATE field. Its mode must be NULLABLE or REQUIRED.
     * 
     */
    public String getField() {
        return this.field;
    }
    public Boolean getRequirePartitionFilter() {
        return this.requirePartitionFilter;
    }
    /**
     * [Required] The supported types are DAY, HOUR, MONTH, and YEAR, which will generate one partition per day, hour, month, and year, respectively. When the type is not specified, the default behavior is DAY.
     * 
     */
    public String getType() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TimePartitioningResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String expirationMs;
        private String field;
        private Boolean requirePartitionFilter;
        private String type;

        public Builder() {
    	      // Empty
        }

        public Builder(TimePartitioningResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.expirationMs = defaults.expirationMs;
    	      this.field = defaults.field;
    	      this.requirePartitionFilter = defaults.requirePartitionFilter;
    	      this.type = defaults.type;
        }

        public Builder setExpirationMs(String expirationMs) {
            this.expirationMs = Objects.requireNonNull(expirationMs);
            return this;
        }

        public Builder setField(String field) {
            this.field = Objects.requireNonNull(field);
            return this;
        }

        public Builder setRequirePartitionFilter(Boolean requirePartitionFilter) {
            this.requirePartitionFilter = Objects.requireNonNull(requirePartitionFilter);
            return this;
        }

        public Builder setType(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public TimePartitioningResponse build() {
            return new TimePartitioningResponse(expirationMs, field, requirePartitionFilter, type);
        }
    }
}
