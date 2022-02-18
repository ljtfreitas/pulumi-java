// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.OutputCustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@OutputCustomType
public final class WindowsEventLogDataSourceResponse {
    /**
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     */
    private final @Nullable String name;
    /**
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
     */
    private final @Nullable List<String> streams;
    /**
     * A list of Windows Event Log queries in XPATH format.
     * 
     */
    private final @Nullable List<String> xPathQueries;

    @OutputCustomType.Constructor({"name","streams","xPathQueries"})
    private WindowsEventLogDataSourceResponse(
        @Nullable String name,
        @Nullable List<String> streams,
        @Nullable List<String> xPathQueries) {
        this.name = name;
        this.streams = streams;
        this.xPathQueries = xPathQueries;
    }

    /**
     * A friendly name for the data source.
     * This name should be unique across all data sources (regardless of type) within the data collection rule.
     * 
     */
    public Optional<String> getName() {
        return Optional.ofNullable(this.name);
    }
    /**
     * List of streams that this data source will be sent to.
     * A stream indicates what schema will be used for this data and usually what table in Log Analytics the data will be sent to.
     * 
     */
    public List<String> getStreams() {
        return this.streams == null ? List.of() : this.streams;
    }
    /**
     * A list of Windows Event Log queries in XPATH format.
     * 
     */
    public List<String> getXPathQueries() {
        return this.xPathQueries == null ? List.of() : this.xPathQueries;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(WindowsEventLogDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable String name;
        private @Nullable List<String> streams;
        private @Nullable List<String> xPathQueries;

        public Builder() {
    	      // Empty
        }

        public Builder(WindowsEventLogDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.name = defaults.name;
    	      this.streams = defaults.streams;
    	      this.xPathQueries = defaults.xPathQueries;
        }

        public Builder setName(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder setStreams(@Nullable List<String> streams) {
            this.streams = streams;
            return this;
        }

        public Builder setXPathQueries(@Nullable List<String> xPathQueries) {
            this.xPathQueries = xPathQueries;
            return this;
        }

        public WindowsEventLogDataSourceResponse build() {
            return new WindowsEventLogDataSourceResponse(name, streams, xPathQueries);
        }
    }
}
