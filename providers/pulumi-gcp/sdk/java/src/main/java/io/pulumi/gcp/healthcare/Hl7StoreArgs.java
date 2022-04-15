// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.gcp.healthcare;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Import;
import io.pulumi.core.internal.Codegen;
import io.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigArgs;
import io.pulumi.gcp.healthcare.inputs.Hl7StoreNotificationConfigsArgs;
import io.pulumi.gcp.healthcare.inputs.Hl7StoreParserConfigArgs;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


public final class Hl7StoreArgs extends io.pulumi.resources.ResourceArgs {

    public static final Hl7StoreArgs Empty = new Hl7StoreArgs();

    /**
     * Identifies the dataset addressed by this request. Must be in the format
     * 'projects/{project}/locations/{location}/datasets/{dataset}'
     * 
     */
    @Import(name="dataset", required=true)
      private final Output<String> dataset;

    public Output<String> dataset() {
        return this.dataset;
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

    public Output<Map<String,String>> labels() {
        return this.labels == null ? Codegen.empty() : this.labels;
    }

    /**
     * The resource name for the Hl7V2Store.
     * ** Changing this property may recreate the Hl7v2 store (removing all data) **
     * 
     */
    @Import(name="name")
      private final @Nullable Output<String> name;

    public Output<String> name() {
        return this.name == null ? Codegen.empty() : this.name;
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
      private final @Nullable Output<Hl7StoreNotificationConfigArgs> notificationConfig;

    @Deprecated /* This field has been replaced by notificationConfigs */
    public Output<Hl7StoreNotificationConfigArgs> notificationConfig() {
        return this.notificationConfig == null ? Codegen.empty() : this.notificationConfig;
    }

    /**
     * A list of notification configs. Each configuration uses a filter to determine whether to publish a
     * message (both Ingest & Create) on the corresponding notification destination. Only the message name
     * is sent as part of the notification. Supplied by the client.
     * Structure is documented below.
     * 
     */
    @Import(name="notificationConfigs")
      private final @Nullable Output<List<Hl7StoreNotificationConfigsArgs>> notificationConfigs;

    public Output<List<Hl7StoreNotificationConfigsArgs>> notificationConfigs() {
        return this.notificationConfigs == null ? Codegen.empty() : this.notificationConfigs;
    }

    /**
     * A nested object resource
     * Structure is documented below.
     * 
     */
    @Import(name="parserConfig")
      private final @Nullable Output<Hl7StoreParserConfigArgs> parserConfig;

    public Output<Hl7StoreParserConfigArgs> parserConfig() {
        return this.parserConfig == null ? Codegen.empty() : this.parserConfig;
    }

    public Hl7StoreArgs(
        Output<String> dataset,
        @Nullable Output<Map<String,String>> labels,
        @Nullable Output<String> name,
        @Nullable Output<Hl7StoreNotificationConfigArgs> notificationConfig,
        @Nullable Output<List<Hl7StoreNotificationConfigsArgs>> notificationConfigs,
        @Nullable Output<Hl7StoreParserConfigArgs> parserConfig) {
        this.dataset = Objects.requireNonNull(dataset, "expected parameter 'dataset' to be non-null");
        this.labels = labels;
        this.name = name;
        this.notificationConfig = notificationConfig;
        this.notificationConfigs = notificationConfigs;
        this.parserConfig = parserConfig;
    }

    private Hl7StoreArgs() {
        this.dataset = Codegen.empty();
        this.labels = Codegen.empty();
        this.name = Codegen.empty();
        this.notificationConfig = Codegen.empty();
        this.notificationConfigs = Codegen.empty();
        this.parserConfig = Codegen.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(Hl7StoreArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private Output<String> dataset;
        private @Nullable Output<Map<String,String>> labels;
        private @Nullable Output<String> name;
        private @Nullable Output<Hl7StoreNotificationConfigArgs> notificationConfig;
        private @Nullable Output<List<Hl7StoreNotificationConfigsArgs>> notificationConfigs;
        private @Nullable Output<Hl7StoreParserConfigArgs> parserConfig;

        public Builder() {
    	      // Empty
        }

        public Builder(Hl7StoreArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.dataset = defaults.dataset;
    	      this.labels = defaults.labels;
    	      this.name = defaults.name;
    	      this.notificationConfig = defaults.notificationConfig;
    	      this.notificationConfigs = defaults.notificationConfigs;
    	      this.parserConfig = defaults.parserConfig;
        }

        public Builder dataset(Output<String> dataset) {
            this.dataset = Objects.requireNonNull(dataset);
            return this;
        }
        public Builder dataset(String dataset) {
            this.dataset = Output.of(Objects.requireNonNull(dataset));
            return this;
        }
        public Builder labels(@Nullable Output<Map<String,String>> labels) {
            this.labels = labels;
            return this;
        }
        public Builder labels(@Nullable Map<String,String> labels) {
            this.labels = Codegen.ofNullable(labels);
            return this;
        }
        public Builder name(@Nullable Output<String> name) {
            this.name = name;
            return this;
        }
        public Builder name(@Nullable String name) {
            this.name = Codegen.ofNullable(name);
            return this;
        }
        public Builder notificationConfig(@Nullable Output<Hl7StoreNotificationConfigArgs> notificationConfig) {
            this.notificationConfig = notificationConfig;
            return this;
        }
        public Builder notificationConfig(@Nullable Hl7StoreNotificationConfigArgs notificationConfig) {
            this.notificationConfig = Codegen.ofNullable(notificationConfig);
            return this;
        }
        public Builder notificationConfigs(@Nullable Output<List<Hl7StoreNotificationConfigsArgs>> notificationConfigs) {
            this.notificationConfigs = notificationConfigs;
            return this;
        }
        public Builder notificationConfigs(@Nullable List<Hl7StoreNotificationConfigsArgs> notificationConfigs) {
            this.notificationConfigs = Codegen.ofNullable(notificationConfigs);
            return this;
        }
        public Builder notificationConfigs(Hl7StoreNotificationConfigsArgs... notificationConfigs) {
            return notificationConfigs(List.of(notificationConfigs));
        }
        public Builder parserConfig(@Nullable Output<Hl7StoreParserConfigArgs> parserConfig) {
            this.parserConfig = parserConfig;
            return this;
        }
        public Builder parserConfig(@Nullable Hl7StoreParserConfigArgs parserConfig) {
            this.parserConfig = Codegen.ofNullable(parserConfig);
            return this;
        }        public Hl7StoreArgs build() {
            return new Hl7StoreArgs(dataset, labels, name, notificationConfig, notificationConfigs, parserConfig);
        }
    }
}
