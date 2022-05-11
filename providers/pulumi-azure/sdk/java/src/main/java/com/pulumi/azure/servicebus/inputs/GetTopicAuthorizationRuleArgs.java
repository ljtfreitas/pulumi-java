// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetTopicAuthorizationRuleArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetTopicAuthorizationRuleArgs Empty = new GetTopicAuthorizationRuleArgs();

    /**
     * The name of the ServiceBus Topic Authorization Rule resource.
     * 
     */
    @Import(name="name", required=true)
    private String name;

    /**
     * @return The name of the ServiceBus Topic Authorization Rule resource.
     * 
     */
    public String name() {
        return this.name;
    }

    /**
     * The name of the ServiceBus Namespace.
     * 
     */
    @Import(name="namespaceName")
    private @Nullable String namespaceName;

    /**
     * @return The name of the ServiceBus Namespace.
     * 
     */
    public Optional<String> namespaceName() {
        return Optional.ofNullable(this.namespaceName);
    }

    @Import(name="queueName")
    private @Nullable String queueName;

    public Optional<String> queueName() {
        return Optional.ofNullable(this.queueName);
    }

    /**
     * The name of the resource group in which the ServiceBus Namespace exists.
     * 
     */
    @Import(name="resourceGroupName")
    private @Nullable String resourceGroupName;

    /**
     * @return The name of the resource group in which the ServiceBus Namespace exists.
     * 
     */
    public Optional<String> resourceGroupName() {
        return Optional.ofNullable(this.resourceGroupName);
    }

    @Import(name="topicId")
    private @Nullable String topicId;

    public Optional<String> topicId() {
        return Optional.ofNullable(this.topicId);
    }

    /**
     * The name of the ServiceBus Topic.
     * 
     */
    @Import(name="topicName")
    private @Nullable String topicName;

    /**
     * @return The name of the ServiceBus Topic.
     * 
     */
    public Optional<String> topicName() {
        return Optional.ofNullable(this.topicName);
    }

    private GetTopicAuthorizationRuleArgs() {}

    private GetTopicAuthorizationRuleArgs(GetTopicAuthorizationRuleArgs $) {
        this.name = $.name;
        this.namespaceName = $.namespaceName;
        this.queueName = $.queueName;
        this.resourceGroupName = $.resourceGroupName;
        this.topicId = $.topicId;
        this.topicName = $.topicName;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetTopicAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetTopicAuthorizationRuleArgs $;

        public Builder() {
            $ = new GetTopicAuthorizationRuleArgs();
        }

        public Builder(GetTopicAuthorizationRuleArgs defaults) {
            $ = new GetTopicAuthorizationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param name The name of the ServiceBus Topic Authorization Rule resource.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            $.name = name;
            return this;
        }

        /**
         * @param namespaceName The name of the ServiceBus Namespace.
         * 
         * @return builder
         * 
         */
        public Builder namespaceName(@Nullable String namespaceName) {
            $.namespaceName = namespaceName;
            return this;
        }

        public Builder queueName(@Nullable String queueName) {
            $.queueName = queueName;
            return this;
        }

        /**
         * @param resourceGroupName The name of the resource group in which the ServiceBus Namespace exists.
         * 
         * @return builder
         * 
         */
        public Builder resourceGroupName(@Nullable String resourceGroupName) {
            $.resourceGroupName = resourceGroupName;
            return this;
        }

        public Builder topicId(@Nullable String topicId) {
            $.topicId = topicId;
            return this;
        }

        /**
         * @param topicName The name of the ServiceBus Topic.
         * 
         * @return builder
         * 
         */
        public Builder topicName(@Nullable String topicName) {
            $.topicName = topicName;
            return this;
        }

        public GetTopicAuthorizationRuleArgs build() {
            $.name = Objects.requireNonNull($.name, "expected parameter 'name' to be non-null");
            return $;
        }
    }

}
