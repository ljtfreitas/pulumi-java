// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of which syslog data will be collected and how it will be collected.
 * Only collected from Linux machines.
 * 
 */
public final class SyslogDataSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final SyslogDataSourceResponse Empty = new SyslogDataSourceResponse();

    /**
     * The list of facility names.
     * 
     */
    @InputImport(name="facilityNames")
    private final @Nullable List<String> facilityNames;

    public List<String> getFacilityNames() {
        return this.facilityNames == null ? List.of() : this.facilityNames;
    }

    /**
     * The log levels to collect.
     * 
     */
    @InputImport(name="logLevels")
    private final @Nullable List<String> logLevels;

    public List<String> getLogLevels() {
        return this.logLevels == null ? List.of() : this.logLevels;
    }

    /**
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     */
    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

    /**
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
     */
    @InputImport(name="streams")
    private final @Nullable List<String> streams;

    public List<String> getStreams() {
        return this.streams == null ? List.of() : this.streams;
    }

    public SyslogDataSourceResponse(
        @Nullable List<String> facilityNames,
        @Nullable List<String> logLevels,
        @Nullable String name,
        @Nullable List<String> streams) {
        this.facilityNames = facilityNames;
        this.logLevels = logLevels;
        this.name = name;
        this.streams = streams;
    }

    private SyslogDataSourceResponse() {
        this.facilityNames = List.of();
        this.logLevels = List.of();
        this.name = null;
        this.streams = List.of();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyslogDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable List<String> facilityNames;
        private @Nullable List<String> logLevels;
        private @Nullable String name;
        private @Nullable List<String> streams;

        public Builder() {
    	      // Empty
        }

        public Builder(SyslogDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.facilityNames = defaults.facilityNames;
    	      this.logLevels = defaults.logLevels;
    	      this.name = defaults.name;
    	      this.streams = defaults.streams;
        }

        public Builder setFacilityNames(@Nullable List<String> facilityNames) {
            this.facilityNames = facilityNames;
            return this;
        }

        public Builder setLogLevels(@Nullable List<String> logLevels) {
            this.logLevels = logLevels;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setStreams(@Nullable List<String> streams) {
            this.streams = streams;
            return this;
        }

        public SyslogDataSourceResponse build() {
            return new SyslogDataSourceResponse(facilityNames, logLevels, name, streams);
        }
    }
}
