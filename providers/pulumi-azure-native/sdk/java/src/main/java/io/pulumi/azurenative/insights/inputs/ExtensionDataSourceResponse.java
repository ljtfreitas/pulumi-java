// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Definition of which data will be collected from a separate VM extension that integrates with the Azure Monitor Agent.
 * Collected from either Windows and Linux machines, depending on which extension is defined.
 * 
 */
public final class ExtensionDataSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExtensionDataSourceResponse Empty = new ExtensionDataSourceResponse();

    /**
     * The name of the VM extension.
     * 
     */
    @InputImport(name="extensionName", required=true)
    private final String extensionName;

    public String getExtensionName() {
        return this.extensionName;
    }

    /**
     * The extension settings. The format is specific for particular extension.
     * 
     */
    @InputImport(name="extensionSettings")
    private final @Nullable Object extensionSettings;

    public Optional<Object> getExtensionSettings() {
        return this.extensionSettings == null ? Optional.empty() : Optional.ofNullable(this.extensionSettings);
    }

    /**
     * The list of data sources this extension needs data from.
     * 
     */
    @InputImport(name="inputDataSources")
    private final @Nullable List<String> inputDataSources;

    public List<String> getInputDataSources() {
        return this.inputDataSources == null ? List.of() : this.inputDataSources;
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

    public ExtensionDataSourceResponse(
        String extensionName,
        @Nullable Object extensionSettings,
        @Nullable List<String> inputDataSources,
        @Nullable String name,
        @Nullable List<String> streams) {
        this.extensionName = Objects.requireNonNull(extensionName, "expected parameter 'extensionName' to be non-null");
        this.extensionSettings = extensionSettings;
        this.inputDataSources = inputDataSources;
        this.name = name;
        this.streams = streams;
    }

    private ExtensionDataSourceResponse() {
        this.extensionName = null;
        this.extensionSettings = null;
        this.inputDataSources = List.of();
        this.name = null;
        this.streams = List.of();
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

        public Builder setExtensionName(String extensionName) {
            this.extensionName = Objects.requireNonNull(extensionName);
            return this;
        }

        public Builder setExtensionSettings(@Nullable Object extensionSettings) {
            this.extensionSettings = extensionSettings;
            return this;
        }

        public Builder setInputDataSources(@Nullable List<String> inputDataSources) {
            this.inputDataSources = inputDataSources;
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

        public ExtensionDataSourceResponse build() {
            return new ExtensionDataSourceResponse(extensionName, extensionSettings, inputDataSources, name, streams);
        }
    }
}
