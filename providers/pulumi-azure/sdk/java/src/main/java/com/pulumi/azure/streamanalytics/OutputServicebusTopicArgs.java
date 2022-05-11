// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.streamanalytics;

import com.pulumi.azure.streamanalytics.inputs.OutputServicebusTopicSerializationArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class OutputServicebusTopicArgs extends com.pulumi.resources.ResourceArgs {

    public static final OutputServicebusTopicArgs Empty = new OutputServicebusTopicArgs();

    /**
     * The name of the Stream Output. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return The name of the Stream Output. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * A list of property columns to add to the Service Bus Topic output.
     * 
     */
    @Import(name="propertyColumns")
    private @Nullable Output<List<String>> propertyColumns;

    /**
     * @return A list of property columns to add to the Service Bus Topic output.
     * 
     */
    public Optional<Output<List<String>>> propertyColumns() {
        return Optional.ofNullable(this.propertyColumns);
    }

    /**
     * The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="resourceGroupName", required=true)
    private Output<String> resourceGroupName;

    /**
     * @return The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> resourceGroupName() {
        return this.resourceGroupName;
    }

    /**
     * A `serialization` block as defined below.
     * 
     */
    @Import(name="serialization", required=true)
    private Output<OutputServicebusTopicSerializationArgs> serialization;

    /**
     * @return A `serialization` block as defined below.
     * 
     */
    public Output<OutputServicebusTopicSerializationArgs> serialization() {
        return this.serialization;
    }

    /**
     * The namespace that is associated with the desired Event Hub, Service Bus Topic, Service Bus Topic, etc.
     * 
     */
    @Import(name="servicebusNamespace", required=true)
    private Output<String> servicebusNamespace;

    /**
     * @return The namespace that is associated with the desired Event Hub, Service Bus Topic, Service Bus Topic, etc.
     * 
     */
    public Output<String> servicebusNamespace() {
        return this.servicebusNamespace;
    }

    /**
     * The shared access policy key for the specified shared access policy.
     * 
     */
    @Import(name="sharedAccessPolicyKey", required=true)
    private Output<String> sharedAccessPolicyKey;

    /**
     * @return The shared access policy key for the specified shared access policy.
     * 
     */
    public Output<String> sharedAccessPolicyKey() {
        return this.sharedAccessPolicyKey;
    }

    /**
     * The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
     * 
     */
    @Import(name="sharedAccessPolicyName", required=true)
    private Output<String> sharedAccessPolicyName;

    /**
     * @return The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
     * 
     */
    public Output<String> sharedAccessPolicyName() {
        return this.sharedAccessPolicyName;
    }

    /**
     * The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="streamAnalyticsJobName", required=true)
    private Output<String> streamAnalyticsJobName;

    /**
     * @return The name of the Stream Analytics Job. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> streamAnalyticsJobName() {
        return this.streamAnalyticsJobName;
    }

    /**
     * A key-value pair of system property columns that will be attached to the outgoing messages for the Service Bus Topic Output.
     * 
     */
    @Import(name="systemPropertyColumns")
    private @Nullable Output<Map<String,String>> systemPropertyColumns;

    /**
     * @return A key-value pair of system property columns that will be attached to the outgoing messages for the Service Bus Topic Output.
     * 
     */
    public Optional<Output<Map<String,String>>> systemPropertyColumns() {
        return Optional.ofNullable(this.systemPropertyColumns);
    }

    /**
     * The name of the Service Bus Topic.
     * 
     */
    @Import(name="topicName", required=true)
    private Output<String> topicName;

    /**
     * @return The name of the Service Bus Topic.
     * 
     */
    public Output<String> topicName() {
        return this.topicName;
    }

    private OutputServicebusTopicArgs() {}

    private OutputServicebusTopicArgs(OutputServicebusTopicArgs $) {
        this.name = $.name;
        this.propertyColumns = $.propertyColumns;
        this.resourceGroupName = $.resourceGroupName;
        this.serialization = $.serialization;
        this.servicebusNamespace = $.servicebusNamespace;
        this.sharedAccessPolicyKey = $.sharedAccessPolicyKey;
        this.sharedAccessPolicyName = $.sharedAccessPolicyName;
        this.streamAnalyticsJobName = $.streamAnalyticsJobName;
        this.systemPropertyColumns = $.systemPropertyColumns;
        this.topicName = $.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(OutputServicebusTopicArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private OutputServicebusTopicArgs $;

        public Builder() {
            $ = new OutputServicebusTopicArgs();
        }

        public Builder(OutputServicebusTopicArgs defaults) {
            $ = new OutputServicebusTopicArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the Stream Output. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name The name of the Stream Output. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param propertyColumns A list of property columns to add to the Service Bus Topic output.
         * 
         * @return builder
         * 
         */
        public Builder propertyColumns(@Nullable Output<List<String>> propertyColumns) {
            $.propertyColumns = propertyColumns;
            return this;
        }

        /**
         * @param propertyColumns A list of property columns to add to the Service Bus Topic output.
         * 
         * @return builder
         * 
         */
        public Builder propertyColumns(List<String> propertyColumns) {
            return propertyColumns(Output.of(propertyColumns));
        }

        /**
         * @param propertyColumns A list of property columns to add to the Service Bus Topic output.
         * 
         * @return builder
         * 
         */
        public Builder propertyColumns(String... propertyColumns) {
            return propertyColumns(List.of(propertyColumns));
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(Output<String> resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the Resource Group where the Stream Analytics Job exists. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(String resourceGroupName) {
            return resourceGroupName(Output.of(resourceGroupName));
        }

        /**
         * @param serialization A `serialization` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder serialization(Output<OutputServicebusTopicSerializationArgs> serialization) {
            $.serialization = serialization;
            return this;
        }

        /**
         * @param serialization A `serialization` block as defined below.
         * 
         * @return builder
         * 
         */
        public Builder serialization(OutputServicebusTopicSerializationArgs serialization) {
            return serialization(Output.of(serialization));
        }

        /**
         * @param servicebusNamespace The namespace that is associated with the desired Event Hub, Service Bus Topic, Service Bus Topic, etc.
         * 
         * @return builder
         * 
         */
        public Builder servicebusNamespace(Output<String> servicebusNamespace) {
            $.servicebusNamespace = servicebusNamespace;
            return this;
        }

        /**
         * @param servicebusNamespace The namespace that is associated with the desired Event Hub, Service Bus Topic, Service Bus Topic, etc.
         * 
         * @return builder
         * 
         */
        public Builder servicebusNamespace(String servicebusNamespace) {
            return servicebusNamespace(Output.of(servicebusNamespace));
        }

        /**
         * @param sharedAccessPolicyKey The shared access policy key for the specified shared access policy.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyKey(Output<String> sharedAccessPolicyKey) {
            $.sharedAccessPolicyKey = sharedAccessPolicyKey;
            return this;
        }

        /**
         * @param sharedAccessPolicyKey The shared access policy key for the specified shared access policy.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyKey(String sharedAccessPolicyKey) {
            return sharedAccessPolicyKey(Output.of(sharedAccessPolicyKey));
        }

        /**
         * @param sharedAccessPolicyName The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyName(Output<String> sharedAccessPolicyName) {
            $.sharedAccessPolicyName = sharedAccessPolicyName;
            return this;
        }

        /**
         * @param sharedAccessPolicyName The shared access policy name for the Event Hub, Service Bus Queue, Service Bus Topic, etc.
         * 
         * @return builder
         * 
         */
        public Builder sharedAccessPolicyName(String sharedAccessPolicyName) {
            return sharedAccessPolicyName(Output.of(sharedAccessPolicyName));
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(Output<String> streamAnalyticsJobName) {
            $.streamAnalyticsJobName = streamAnalyticsJobName;
            return this;
        }

        /**
         * @param streamAnalyticsJobName The name of the Stream Analytics Job. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder streamAnalyticsJobName(String streamAnalyticsJobName) {
            return streamAnalyticsJobName(Output.of(streamAnalyticsJobName));
        }

        /**
         * @param systemPropertyColumns A key-value pair of system property columns that will be attached to the outgoing messages for the Service Bus Topic Output.
         * 
         * @return builder
         * 
         */
        public Builder systemPropertyColumns(@Nullable Output<Map<String,String>> systemPropertyColumns) {
            $.systemPropertyColumns = systemPropertyColumns;
            return this;
        }

        /**
         * @param systemPropertyColumns A key-value pair of system property columns that will be attached to the outgoing messages for the Service Bus Topic Output.
         * 
         * @return builder
         * 
         */
        public Builder systemPropertyColumns(Map<String,String> systemPropertyColumns) {
            return systemPropertyColumns(Output.of(systemPropertyColumns));
        }

        /**
         * @param topicName The name of the Service Bus Topic.
         * 
         * @return builder
         * 
         */
        public Builder topicName(Output<String> topicName) {
            $.topicName = topicName;
            return this;
        }

        /**
         * @param topicName The name of the Service Bus Topic.
         * 
         * @return builder
         * 
         */
        public Builder topicName(String topicName) {
            return topicName(Output.of(topicName));
        }

        public OutputServicebusTopicArgs build() {
            $.resourceGroupName = Objects.requireNonNull($.resourceGroupName, "expected parameter 'resourceGroupName' to be non-null");
            $.serialization = Objects.requireNonNull($.serialization, "expected parameter 'serialization' to be non-null");
            $.servicebusNamespace = Objects.requireNonNull($.servicebusNamespace, "expected parameter 'servicebusNamespace' to be non-null");
            $.sharedAccessPolicyKey = Objects.requireNonNull($.sharedAccessPolicyKey, "expected parameter 'sharedAccessPolicyKey' to be non-null");
            $.sharedAccessPolicyName = Objects.requireNonNull($.sharedAccessPolicyName, "expected parameter 'sharedAccessPolicyName' to be non-null");
            $.streamAnalyticsJobName = Objects.requireNonNull($.streamAnalyticsJobName, "expected parameter 'streamAnalyticsJobName' to be non-null");
            $.topicName = Objects.requireNonNull($.topicName, "expected parameter 'topicName' to be non-null");
            return $;
        }
    }

}
