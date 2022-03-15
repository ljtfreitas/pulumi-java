// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.outputs;

import io.pulumi.core.annotations.CustomType;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ExtensionDataSourceResponse {
    /**
     * The name of the VM extension.
     * 
     */
    private final String extensionName;
    /**
     * The extension settings. The format is specific for particular extension.
     * 
     */
    private final @Nullable Object extensionSettings;
    /**
     * The list of data sources this extension needs data from.
     * 
     */
    private final @Nullable List<String> inputDataSources;
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

    @CustomType.Constructor
    private ExtensionDataSourceResponse(
        @CustomType.Parameter("extensionName") String extensionName,
        @CustomType.Parameter("extensionSettings") @Nullable Object extensionSettings,
        @CustomType.Parameter("inputDataSources") @Nullable List<String> inputDataSources,
        @CustomType.Parameter("name") @Nullable String name,
        @CustomType.Parameter("streams") @Nullable List<String> streams) {
        this.extensionName = extensionName;
        this.extensionSettings = extensionSettings;
        this.inputDataSources = inputDataSources;
        this.name = name;
        this.streams = streams;
    }

    /**
     * The name of the VM extension.
     * 
    */
    public String getExtensionName() {
        return this.extensionName;
    }
    /**
     * The extension settings. The format is specific for particular extension.
     * 
    */
    public Optional<Object> getExtensionSettings() {
        return Optional.ofNullable(this.extensionSettings);
    }
    /**
     * The list of data sources this extension needs data from.
     * 
    */
    public List<String> getInputDataSources() {
        return this.inputDataSources == null ? List.of() : this.inputDataSources;
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

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ExtensionDataSourceResponse defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private String extensionName;
        private @Nullable Object extensionSettings;
        private @Nullable List<String> inputDataSources;
        private @Nullable String name;
        private @Nullable List<String> streams;

        public Builder() {
    	      // Empty
        }

        public Builder(ExtensionDataSourceResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.extensionName = defaults.extensionName;
    	      this.extensionSettings = defaults.extensionSettings;
    	      this.inputDataSources = defaults.inputDataSources;
    	      this.name = defaults.name;
    	      this.streams = defaults.streams;
        }

        public Builder extensionName(String extensionName) {
            this.extensionName = Objects.requireNonNull(extensionName);
            return this;
        }

        public Builder extensionSettings(@Nullable Object extensionSettings) {
            this.extensionSettings = extensionSettings;
            return this;
        }

        public Builder inputDataSources(@Nullable List<String> inputDataSources) {
            this.inputDataSources = inputDataSources;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }

        public Builder streams(@Nullable List<String> streams) {
            this.streams = streams;
            return this;
        }
        public ExtensionDataSourceResponse build() {
            return new ExtensionDataSourceResponse(extensionName, extensionSettings, inputDataSources, name, streams);
        }
    }
}
