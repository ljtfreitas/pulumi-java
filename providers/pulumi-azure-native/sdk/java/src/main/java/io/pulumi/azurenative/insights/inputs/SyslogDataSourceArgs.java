// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.azurenative.insights.enums.KnownSyslogDataSourceFacilityNames;
import io.pulumi.azurenative.insights.enums.KnownSyslogDataSourceLogLevels;
import io.pulumi.azurenative.insights.enums.KnownSyslogDataSourceStreams;
import io.pulumi.core.Either;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * Definition of which syslog data will be collected and how it will be collected.
 * Only collected from Linux machines.
 * 
 */
public final class SyslogDataSourceArgs extends io.pulumi.resources.ResourceArgs {

    public static final SyslogDataSourceArgs Empty = new SyslogDataSourceArgs();

    /**
     * The list of facility names.
     * 
     */
    @InputImport(name="facilityNames")
    private final @Nullable Input<List<Either<String,KnownSyslogDataSourceFacilityNames>>> facilityNames;

    public Input<List<Either<String,KnownSyslogDataSourceFacilityNames>>> getFacilityNames() {
        return this.facilityNames == null ? Input.empty() : this.facilityNames;
    }

    /**
     * The log levels to collect.
     * 
     */
    @InputImport(name="logLevels")
    private final @Nullable Input<List<Either<String,KnownSyslogDataSourceLogLevels>>> logLevels;

    public Input<List<Either<String,KnownSyslogDataSourceLogLevels>>> getLogLevels() {
        return this.logLevels == null ? Input.empty() : this.logLevels;
    }

    /**
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     */
    @InputImport(name="name")
    private final @Nullable Input<String> name;

    public Input<String> getName() {
        return this.name == null ? Input.empty() : this.name;
    }

    /**
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
     */
    @InputImport(name="streams")
    private final @Nullable Input<List<Either<String,KnownSyslogDataSourceStreams>>> streams;

    public Input<List<Either<String,KnownSyslogDataSourceStreams>>> getStreams() {
        return this.streams == null ? Input.empty() : this.streams;
    }

    public SyslogDataSourceArgs(
        @Nullable Input<List<Either<String,KnownSyslogDataSourceFacilityNames>>> facilityNames,
        @Nullable Input<List<Either<String,KnownSyslogDataSourceLogLevels>>> logLevels,
        @Nullable Input<String> name,
        @Nullable Input<List<Either<String,KnownSyslogDataSourceStreams>>> streams) {
        this.facilityNames = facilityNames;
        this.logLevels = logLevels;
        this.name = name;
        this.streams = streams;
    }

    private SyslogDataSourceArgs() {
        this.facilityNames = Input.empty();
        this.logLevels = Input.empty();
        this.name = Input.empty();
        this.streams = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(SyslogDataSourceArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<Either<String,KnownSyslogDataSourceFacilityNames>>> facilityNames;
        private @Nullable Input<List<Either<String,KnownSyslogDataSourceLogLevels>>> logLevels;
        private @Nullable Input<String> name;
        private @Nullable Input<List<Either<String,KnownSyslogDataSourceStreams>>> streams;

        public Builder() {
    	      // Empty
        }

        public Builder(SyslogDataSourceArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.facilityNames = defaults.facilityNames;
    	      this.logLevels = defaults.logLevels;
    	      this.name = defaults.name;
    	      this.streams = defaults.streams;
        }

        public Builder setFacilityNames(@Nullable Input<List<Either<String,KnownSyslogDataSourceFacilityNames>>> facilityNames) {
            this.facilityNames = facilityNames;
            return this;
        }

        public Builder setFacilityNames(@Nullable List<Either<String,KnownSyslogDataSourceFacilityNames>> facilityNames) {
            this.facilityNames = Input.ofNullable(facilityNames);
            return this;
        }

        public Builder setLogLevels(@Nullable Input<List<Either<String,KnownSyslogDataSourceLogLevels>>> logLevels) {
            this.logLevels = logLevels;
            return this;
        }

        public Builder setLogLevels(@Nullable List<Either<String,KnownSyslogDataSourceLogLevels>> logLevels) {
            this.logLevels = Input.ofNullable(logLevels);
            return this;
        }

        public Builder setName(@Nullable Input<String> name) {
            this.name = name;
            return this;
        }

        public Builder setName(@Nullable String name) {
            this.name = Input.ofNullable(name);
            return this;
        }

        public Builder setStreams(@Nullable Input<List<Either<String,KnownSyslogDataSourceStreams>>> streams) {
            this.streams = streams;
            return this;
        }

        public Builder setStreams(@Nullable List<Either<String,KnownSyslogDataSourceStreams>> streams) {
            this.streams = Input.ofNullable(streams);
            return this;
        }

        public SyslogDataSourceArgs build() {
            return new SyslogDataSourceArgs(facilityNames, logLevels, name, streams);
        }
    }
}
