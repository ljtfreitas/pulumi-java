// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights.inputs;

import io.pulumi.core.internal.annotations.InputImport;
import java.lang.Object;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ExtensionDataSourceResponse extends io.pulumi.resources.InvokeArgs {

    public static final ExtensionDataSourceResponse Empty = new ExtensionDataSourceResponse();

    @InputImport(name="extensionName", required=true)
    private final String extensionName;

    public String getExtensionName() {
        return this.extensionName;
    }

    @InputImport(name="extensionSettings")
    private final @Nullable Object extensionSettings;

    public Optional<Object> getExtensionSettings() {
        return this.extensionSettings == null ? Optional.empty() : Optional.ofNullable(this.extensionSettings);
    }

    @InputImport(name="inputDataSources")
    private final @Nullable List<String> inputDataSources;

    public List<String> getInputDataSources() {
        return this.inputDataSources == null ? List.of() : this.inputDataSources;
    }

    @InputImport(name="name")
    private final @Nullable String name;

    public Optional<String> getName() {
        return this.name == null ? Optional.empty() : Optional.ofNullable(this.name);
    }

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