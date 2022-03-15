// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare.inputs;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigGetArgs;
import io.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigsGetArgs;
import io.pulumi.gcp.healthcare.inputs.Hl7StoreParserConfigGetArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class Hl7StoreState extends io.pulumi.resources.ResourceArgs {

    public static final Hl7StoreState Empty = new Hl7StoreState();

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * 
     */
    @Import(name="dataset")
      private final @Nullable Output<String> dataset;

    public Output<String> getDataset() {
        return this.dataset == null ? Output.empty() : this.dataset;
    }

    /**
     * User-supplied key-value pairs used to organize HL7v2 stores.
     * Label keys must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128 bytes, and must
     * conform to the following PCRE regular expression: [\p{Ll}\p{Lo}][\p{Ll}\p{Lo}\p{N}_-]{0,62}
     * Label values are optional, must be between 1 and 63 characters long, have a UTF-8 encoding of maximum 128
     * bytes, and must conform to the following PCRE regular expression: [\p{Ll}\p{Lo}\p{N}_-]{0,63}
     * No more than 64 labels can be associated with a given store.
     * An object containing a list of "key": value pairs.
     * Example: { "name": "wrench", "mass": "1.3kg", "count": "3" }.
     * 
     */
    @Import(name="labels")
      private final @Nullable Output<Map<String,String>> labels;

    public Output<Map<String,String>> getLabels() {
        return this.labels == null ? Output.empty() : this.labels;
    }

    /**
     * The resource name for the Hl7V2Store.
     * ** Changing this property may recreate the Hl7v2 store (removing all data) **
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> getName() {
        return this.name == null ? Output.empty() : this.name;
    }

    /**
     * - 
     * (Optional, Deprecated)
     * A nested object resource
     * Structure is documented below.
     * 
     * @Deprecated
     * This field has been replaced by notificationConfigs
     * 
     */
    @Deprecated /* This field has been replaced by notificationConfigs */
    @Import(name="notificationConfig")
      private final @Nullable Output<Hl7StoreNotificationConfigGetArgs> notificationConfig;

    @Deprecated /* This field has been replaced by notificationConfigs */
    public Output<Hl7StoreNotificationConfigGetArgs> getNotificationConfig() {
        return this.notificationConfig == null ? Output.empty() : this.notificationConfig;
    }

    /**
     * A list of notification configs. Each configuration uses a filter to determine whether to publish a
     * message (both Ingest & Create) on the corresponding notification destination. Only the message name
     * is sent as part of the notification. Supplied by the client.
     * Structure is documented below.
     * 
     */
    @Import(name="notificationConfigs")
      private final @Nullable Output<List<Hl7StoreNotificationConfigsGetArgs>> notificationConfigs;

    public Output<List<Hl7StoreNotificationConfigsGetArgs>> getNotificationConfigs() {
        return this.notificationConfigs == null ? Output.empty() : this.notificationConfigs;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Import(name="parserConfig")
      private final @Nullable Output<Hl7StoreParserConfigGetArgs> parserConfig;

    public Output<Hl7StoreParserConfigGetArgs> getParserConfig() {
        return this.parserConfig == null ? Output.empty() : this.parserConfig;
    }

    /**
     * The fully qualified name of this dataset
     * 
     */
    @Import(name="selfLink")
      private final @Nullable Output<String> selfLink;

    public Output<String> getSelfLink() {
        return this.selfLink == null ? Output.empty() : this.selfLink;
    }

    public Hl7StoreState(
        @Nullable Output<String> dataset,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<Hl7StoreNotificationConfigGetArgs> notificationConfig,
        @Nullable Output<List<Hl7StoreNotificationConfigsGetArgs>> notificationConfigs,
        @Nullable Output<Hl7StoreParserConfigGetArgs> parserConfig,
        @Nullable Output<String> selfLink) {
        this.dataset = dataset;
        this.labels = labels;
        this.name = name;
        this.notificationConfig = notificationConfig;
        this.notificationConfigs = notificationConfigs;
        this.parserConfig = parserConfig;
        this.selfLink = selfLink;
    }

    private Hl7StoreState() {
        this.dataset = Output.empty();
        this.labels = Output.empty();
        this.name = Output.empty();
        this.notificationConfig = Output.empty();
        this.notificationConfigs = Output.empty();
        this.parserConfig = Output.empty();
        this.selfLink = Output.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7StoreState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Output<String> dataset;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<Hl7StoreNotificationConfigGetArgs> notificationConfig;
        private @Nullable Output<List<Hl7StoreNotificationConfigsGetArgs>> notificationConfigs;
        private @Nullable Output<Hl7StoreParserConfigGetArgs> parserConfig;
        private @Nullable Output<String> selfLink;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7StoreState defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.notificationConfigs = defaults.notificationConfigs;
    	      this.parserConfig = defaults.parserConfig;
    	      this.selfLink = defaults.selfLink;
        }

        public Builder dataset(@Nullable Output<String> dataset) {
            this.dataset = dataset;
            return this;
        }

        public Builder dataset(@Nullable String dataset) {
            this.dataset = Output.ofNullable(dataset);
            return this;
        }

        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }

        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Output.ofNullable(labels);
            return this;
        }

        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }

        public Builder name(@Nullable String name) {
            this.name = Output.ofNullable(name);
            return this;
        }

        public Builder notificationConfig(@Nullable Output<Hl7StoreNotificationConfigGetArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }

        public Builder notificationConfig(@Nullable Hl7StoreNotificationConfigGetArgs notificationConfig) {
            this.notificationConfig = Output.ofNullable(notificationConfig);
            return this;
        }

        public Builder notificationConfigs(@Nullable Output<List<Hl7StoreNotificationConfigsGetArgs>> notificationConfigs) {
            this.notificationConfigs = notificationConfigs;
            return this;
        }

        public Builder notificationConfigs(@Nullable List<Hl7StoreNotificationConfigsGetArgs> notificationConfigs) {
            this.notificationConfigs = Output.ofNullable(notificationConfigs);
            return this;
        }

        public Builder parserConfig(@Nullable Output<Hl7StoreParserConfigGetArgs> parserConfig) {
            this.parserConfig = parserConfig;
            return this;
        }

        public Builder parserConfig(@Nullable Hl7StoreParserConfigGetArgs parserConfig) {
            this.parserConfig = Output.ofNullable(parserConfig);
            return this;
        }

        public Builder selfLink(@Nullable Output<String> selfLink) {
            this.selfLink = selfLink;
            return this;
        }

        public Builder selfLink(@Nullable String selfLink) {
            this.selfLink = Output.ofNullable(selfLink);
            return this;
        }
        public Hl7StoreState build() {
            return new Hl7StoreState(dataset, labels, name, notificationConfig, notificationConfigs, parserConfig, selfLink);
        }
    }
}
