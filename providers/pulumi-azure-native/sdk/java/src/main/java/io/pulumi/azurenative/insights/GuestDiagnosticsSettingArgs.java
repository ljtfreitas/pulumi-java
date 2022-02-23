// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.insights;

import io.pulumi.azurenative.insights.inputs.DataSourceArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class GuestDiagnosticsSettingArgs extends io.pulumi.resources.ResourceArgs {

    public static final GuestDiagnosticsSettingArgs Empty = new GuestDiagnosticsSettingArgs();

    /**
     * the array of data source object which are configured to collect and send data
     * 
     */
    @InputImport(name="dataSources")
        private final @Nullable Input<List<DataSourceArgs>> dataSources;

    public Input<List<DataSourceArgs>> getDataSources() {
        return this.dataSources == null ? Input.empty() : this.dataSources;
    }

    /**
     * The name of the diagnostic setting.
     * 
     */
    @InputImport(name="diagnosticSettingsName")
        private final @Nullable Input<String> diagnosticSettingsName;

    public Input<String> getDiagnosticSettingsName() {
        return this.diagnosticSettingsName == null ? Input.empty() : this.diagnosticSettingsName;
    }

    /**
     * Resource location
     * 
     */
    @InputImport(name="location")
        private final @Nullable Input<String> location;

    public Input<String> getLocation() {
        return this.location == null ? Input.empty() : this.location;
    }

    /**
     * Operating system type for the configuration
     * 
     */
    @InputImport(name="osType")
        private final @Nullable Input<String> osType;

    public Input<String> getOsType() {
        return this.osType == null ? Input.empty() : this.osType;
    }

    @InputImport(name="proxySetting")
        private final @Nullable Input<String> proxySetting;

    public Input<String> getProxySetting() {
        return this.proxySetting == null ? Input.empty() : this.proxySetting;
    }

    /**
     * The name of the resource group. The name is case insensitive.
     * 
     */
    @InputImport(name="resourceGroupName", required=true)
        private final Input<String> resourceGroupName;

    public Input<String> getResourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * Resource tags
     * 
     */
    @InputImport(name="tags")
        private final @Nullable Input<Map<String,String>> tags;

    public Input<Map<String,String>> getTags() {
        return this.tags == null ? Input.empty() : this.tags;
    }

    public GuestDiagnosticsSettingArgs(
        @Nullable Input<List<DataSourceArgs>> dataSources,
        @Nullable Input<String> diagnosticSettingsName,
        @Nullable Input<String> location,
        @Nullable Input<String> osType,
        @Nullable Input<String> proxySetting,
        Input<String> resourceGroupName,
        @Nullable Input<Map<String,String>> tags) {
        this.dataSources = dataSources;
        this.diagnosticSettingsName = diagnosticSettingsName;
        this.location = location;
        this.osType = osType;
        this.proxySetting = proxySetting;
        this.resourceGroupName = Objects.requireNonNull(resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
        this.tags = tags;
    }

    private GuestDiagnosticsSettingArgs() {
        this.dataSources = Input.empty();
        this.diagnosticSettingsName = Input.empty();
        this.location = Input.empty();
        this.osType = Input.empty();
        this.proxySetting = Input.empty();
        this.resourceGroupName = Input.empty();
        this.tags = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GuestDiagnosticsSettingArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<List<DataSourceArgs>> dataSources;
        private @Nullable Input<String> diagnosticSettingsName;
        private @Nullable Input<String> location;
        private @Nullable Input<String> osType;
        private @Nullable Input<String> proxySetting;
        private Input<String> resourceGroupName;
        private @Nullable Input<Map<String,String>> tags;

        public Builder() {
    	      // Empty
        }

        public Builder(GuestDiagnosticsSettingArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataSources = defaults.dataSources;
    	      this.diagnosticSettingsName = defaults.diagnosticSettingsName;
    	      this.location = defaults.location;
    	      this.osType = defaults.osType;
    	      this.proxySetting = defaults.proxySetting;
    	      this.resourceGroupName = defaults.resourceGroupName;
    	      this.tags = defaults.tags;
        }

        public Builder setDataSources(@Nullable Input<List<DataSourceArgs>> dataSources) {
            this.dataSources = dataSources;
            return this;
        }

        public Builder setDataSources(@Nullable List<DataSourceArgs> dataSources) {
            this.dataSources = Input.ofNullable(dataSources);
            return this;
        }

        public Builder setDiagnosticSettingsName(@Nullable Input<String> diagnosticSettingsName) {
            this.diagnosticSettingsName = diagnosticSettingsName;
            return this;
        }

        public Builder setDiagnosticSettingsName(@Nullable String diagnosticSettingsName) {
            this.diagnosticSettingsName = Input.ofNullable(diagnosticSettingsName);
            return this;
        }

        public Builder setLocation(@Nullable Input<String> location) {
            this.location = location;
            return this;
        }

        public Builder setLocation(@Nullable String location) {
            this.location = Input.ofNullable(location);
            return this;
        }

        public Builder setOsType(@Nullable Input<String> osType) {
            this.osType = osType;
            return this;
        }

        public Builder setOsType(@Nullable String osType) {
            this.osType = Input.ofNullable(osType);
            return this;
        }

        public Builder setProxySetting(@Nullable Input<String> proxySetting) {
            this.proxySetting = proxySetting;
            return this;
        }

        public Builder setProxySetting(@Nullable String proxySetting) {
            this.proxySetting = Input.ofNullable(proxySetting);
            return this;
        }

        public Builder setResourceGroupName(Input<String> resourceGroupName) {
            this.resourceGroupName = Objects.requireNonNull(resourceGroupName);
            return this;
        }

        public Builder setResourceGroupName(String resourceGroupName) {
            this.resourceGroupName = Input.of(Objects.requireNonNull(resourceGroupName));
            return this;
        }

        public Builder setTags(@Nullable Input<Map<String,String>> tags) {
            this.tags = tags;
            return this;
        }

        public Builder setTags(@Nullable Map<String,String> tags) {
            this.tags = Input.ofNullable(tags);
            return this;
        }
        public GuestDiagnosticsSettingArgs build() {
            return new GuestDiagnosticsSettingArgs(dataSources, diagnosticSettingsName, location, osType, proxySetting, resourceGroupName, tags);
        }
    }
}
