// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.appconfiguration.inputs;

import com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTargetingFilterArgs;
import com.pulumi.azure.appconfiguration.inputs.ConfigurationFeatureTimewindowFilterArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class ConfigurationFeatureState extends com.pulumi.resources.ResourceArgs {

    public static final ConfigurationFeatureState Empty = new ConfigurationFeatureState();

    /**
     * Specifies the id of the App Configuration. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="configurationStoreId")
    private @Nullable Output<String> configurationStoreId;

    /**
     * @return Specifies the id of the App Configuration. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> configurationStoreId() {
        return Optional.ofNullable(this.configurationStoreId);
    }

    /**
     * The description of the App Configuration Feature.
     * 
     */
    @Import(name="description")
    private @Nullable Output<String> description;

    /**
     * @return The description of the App Configuration Feature.
     * 
     */
    public Optional<Output<String>> description() {
        return Optional.ofNullable(this.description);
    }

    /**
     * The status of the App Configuration Feature. By default, this is set to false.
     * 
     */
    @Import(name="enabled")
    private @Nullable Output<Boolean> enabled;

    /**
     * @return The status of the App Configuration Feature. By default, this is set to false.
     * 
     */
    public Optional<Output<Boolean>> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    @Import(name="etag")
    private @Nullable Output<String> etag;

    public Optional<Output<String>> etag() {
        return Optional.ofNullable(this.etag);
    }

    /**
     * The label of the App Configuration Feature.  Changing this forces a new resource to be created.
     * 
     */
    @Import(name="label")
    private @Nullable Output<String> label;

    /**
     * @return The label of the App Configuration Feature.  Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> label() {
        return Optional.ofNullable(this.label);
    }

    /**
     * Should this App Configuration Feature be Locked to prevent changes?
     * 
     */
    @Import(name="locked")
    private @Nullable Output<Boolean> locked;

    /**
     * @return Should this App Configuration Feature be Locked to prevent changes?
     * 
     */
    public Optional<Output<Boolean>> locked() {
        return Optional.ofNullable(this.locked);
    }

    /**
     * The name of the App Configuration Feature. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the App Configuration Feature. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of one or more numbers representing the value of the percentage required to enable this feature.
     * 
     */
    @Import(name="percentageFilterValue")
    private @Nullable Output<Integer> percentageFilterValue;

    /**
     * @return A list of one or more numbers representing the value of the percentage required to enable this feature.
     * 
     */
    public Optional<Output<Integer>> percentageFilterValue() {
        return Optional.ofNullable(this.percentageFilterValue);
    }

    /**
     * A mapping of tags to assign to the resource.
     * 
     */
    @Import(name="tags")
    private @Nullable Output<Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource.
     * 
     */
    public Optional<Output<Map<String,String>>> tags() {
        return Optional.ofNullable(this.tags);
    }

    /**
     * A `targeting_filter` block as defined below.
     * 
     */
    @Import(name="targetingFilters")
    private @Nullable Output<List<ConfigurationFeatureTargetingFilterArgs>> targetingFilters;

    /**
     * @return A `targeting_filter` block as defined below.
     * 
     */
    public Optional<Output<List<ConfigurationFeatureTargetingFilterArgs>>> targetingFilters() {
        return Optional.ofNullable(this.targetingFilters);
    }

    /**
     * A `targeting_filter` block `timewindow_filter` as defined below.
     * 
     */
    @Import(name="timewindowFilters")
    private @Nullable Output<List<ConfigurationFeatureTimewindowFilterArgs>> timewindowFilters;

    /**
     * @return A `targeting_filter` block `timewindow_filter` as defined below.
     * 
     */
    public Optional<Output<List<ConfigurationFeatureTimewindowFilterArgs>>> timewindowFilters() {
        return Optional.ofNullable(this.timewindowFilters);
    }

    private ConfigurationFeatureState() {}

    private ConfigurationFeatureState(ConfigurationFeatureState $) {
        this.configurationStoreId = $.configurationStoreId;
        this.description = $.description;
        this.enabled = $.enabled;
        this.etag = $.etag;
        this.label = $.label;
        this.locked = $.locked;
        this.name = $.name;
        this.percentageFilterValue = $.percentageFilterValue;
        this.tags = $.tags;
        this.targetingFilters = $.targetingFilters;
        this.timewindowFilters = $.timewindowFilters;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(ConfigurationFeatureState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private ConfigurationFeatureState $;

        public Builder() {
            $ = new ConfigurationFeatureState();
        }

        public Builder(ConfigurationFeatureState defaults) {
            $ = new ConfigurationFeatureState(Objects.requireNonNull(defaults));
        }

        /**
         * @param configurationStoreId Specifies the id of the App Configuration. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder configurationStoreId(@Nullable Output<String> configurationStoreId) {
            $.configurationStoreId = configurationStoreId;
            return this;
        }

        /**
         * @param configurationStoreId Specifies the id of the App Configuration. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder configurationStoreId(String configurationStoreId) {
            return configurationStoreId(Output.of(configurationStoreId));
        }

        /**
         * @param description The description of the App Configuration Feature.
         * 
         * @return builder
         * 
         */
        public Builder description(@Nullable Output<String> description) {
            $.description = description;
            return this;
        }

        /**
         * @param description The description of the App Configuration Feature.
         * 
         * @return builder
         * 
         */
        public Builder description(String description) {
            return description(Output.of(description));
        }

        /**
         * @param enabled The status of the App Configuration Feature. By default, this is set to false.
         * 
         * @return builder
         * 
         */
        public Builder enabled(@Nullable Output<Boolean> enabled) {
            $.enabled = enabled;
            return this;
        }

        /**
         * @param enabled The status of the App Configuration Feature. By default, this is set to false.
         * 
         * @return builder
         * 
         */
        public Builder enabled(Boolean enabled) {
            return enabled(Output.of(enabled));
        }

        public Builder etag(@Nullable Output<String> etag) {
            $.etag = etag;
            return this;
        }

        public Builder etag(String etag) {
            return etag(Output.of(etag));
        }

        /**
         * @param label The label of the App Configuration Feature.  Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder label(@Nullable Output<String> label) {
            $.label = label;
            return this;
        }

        /**
         * @param label The label of the App Configuration Feature.  Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder label(String label) {
            return label(Output.of(label));
        }

        /**
         * @param locked Should this App Configuration Feature be Locked to prevent changes?
         * 
         * @return builder
         * 
         */
        public Builder locked(@Nullable Output<Boolean> locked) {
            $.locked = locked;
            return this;
        }

        /**
         * @param locked Should this App Configuration Feature be Locked to prevent changes?
         * 
         * @return builder
         * 
         */
        public Builder locked(Boolean locked) {
            return locked(Output.of(locked));
        }

        /**
         * @param name The name of the App Configuration Feature. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the App Configuration Feature. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param percentageFilterValue A list of one or more numbers representing the value of the percentage required to enable this feature.
         * 
         * @return builder
         * 
         */
        public Builder percentageFilterValue(@Nullable Output<Integer> percentageFilterValue) {
            $.percentageFilterValue = percentageFilterValue;
            return this;
        }

        /**
         * @param percentageFilterValue A list of one or more numbers representing the value of the percentage required to enable this feature.
         * 
         * @return builder
         * 
         */
        public Builder percentageFilterValue(Integer percentageFilterValue) {
            return percentageFilterValue(Output.of(percentageFilterValue));
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(@Nullable Output<Map<String,String>> tags) {
            $.tags = tags;
            return this;
        }

        /**
         * @param tags A mapping of tags to assign to the resource.
         * 
         * @return builder
         * 
         */
        public Builder tags(Map<String,String> tags) {
            return tags(Output.of(tags));
        }

        /**
         * @param targetingFilters A `targeting_filter` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder targetingFilters(@Nullable Output<List<ConfigurationFeatureTargetingFilterArgs>> targetingFilters) {
            $.targetingFilters = targetingFilters;
            return this;
        }

        /**
         * @param targetingFilters A `targeting_filter` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder targetingFilters(List<ConfigurationFeatureTargetingFilterArgs> targetingFilters) {
            return targetingFilters(Output.of(targetingFilters));
        }

        /**
         * @param targetingFilters A `targeting_filter` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder targetingFilters(ConfigurationFeatureTargetingFilterArgs... targetingFilters) {
            return targetingFilters(List.of(targetingFilters));
        }

        /**
         * @param timewindowFilters A `targeting_filter` block `timewindow_filter` as defined below.
         * 
         * @return builder
         * 
         */
        public Builder timewindowFilters(@Nullable Output<List<ConfigurationFeatureTimewindowFilterArgs>> timewindowFilters) {
            $.timewindowFilters = timewindowFilters;
            return this;
        }

        /**
         * @param timewindowFilters A `targeting_filter` block `timewindow_filter` as defined below.
         * 
         * @return builder
         * 
         */
        public Builder timewindowFilters(List<ConfigurationFeatureTimewindowFilterArgs> timewindowFilters) {
            return timewindowFilters(Output.of(timewindowFilters));
        }

        /**
         * @param timewindowFilters A `targeting_filter` block `timewindow_filter` as defined below.
         * 
         * @return builder
         * 
         */
        public Builder timewindowFilters(ConfigurationFeatureTimewindowFilterArgs... timewindowFilters) {
            return timewindowFilters(List.of(timewindowFilters));
        }

        public ConfigurationFeatureState build() {
            return $;
        }
    }

}
