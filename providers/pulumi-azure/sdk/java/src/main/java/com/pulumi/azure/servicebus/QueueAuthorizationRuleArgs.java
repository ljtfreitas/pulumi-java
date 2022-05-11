// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.azure.servicebus;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class QueueAuthorizationRuleArgs extends com.pulumi.resources.ResourceArgs {

    public static final QueueAuthorizationRuleArgs Empty = new QueueAuthorizationRuleArgs();

    /**
     * Does this Authorization Rule have Listen permissions to the ServiceBus Queue? Defaults to `false`.
     * 
     */
    @Import(name="listen")
    private @Nullable Output<Boolean> listen;

    /**
     * @return Does this Authorization Rule have Listen permissions to the ServiceBus Queue? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> listen() {
        return Optional.ofNullable(this.listen);
    }

    /**
     * Does this Authorization Rule have Manage permissions to the ServiceBus Queue? When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
     * 
     */
    @Import(name="manage")
    private @Nullable Output<Boolean> manage;

    /**
     * @return Does this Authorization Rule have Manage permissions to the ServiceBus Queue? When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> manage() {
        return Optional.ofNullable(this.manage);
    }

    /**
     * Specifies the name of the Authorization Rule. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="name")
    private @Nullable Output<String> name;

    /**
     * @return Specifies the name of the Authorization Rule. Changing this forces a new resource to be created.
     * 
     */
    public Optional<Output<String>> name() {
        return Optional.ofNullable(this.name);
    }

    /**
     * Specifies the ID of the ServiceBus Queue. Changing this forces a new resource to be created.
     * 
     */
    @Import(name="queueId", required=true)
    private Output<String> queueId;

    /**
     * @return Specifies the ID of the ServiceBus Queue. Changing this forces a new resource to be created.
     * 
     */
    public Output<String> queueId() {
        return this.queueId;
    }

    /**
     * Does this Authorization Rule have Send permissions to the ServiceBus Queue? Defaults to `false`.
     * 
     */
    @Import(name="send")
    private @Nullable Output<Boolean> send;

    /**
     * @return Does this Authorization Rule have Send permissions to the ServiceBus Queue? Defaults to `false`.
     * 
     */
    public Optional<Output<Boolean>> send() {
        return Optional.ofNullable(this.send);
    }

    private QueueAuthorizationRuleArgs() {}

    private QueueAuthorizationRuleArgs(QueueAuthorizationRuleArgs $) {
        this.listen = $.listen;
        this.manage = $.manage;
        this.name = $.name;
        this.queueId = $.queueId;
        this.send = $.send;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(QueueAuthorizationRuleArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private QueueAuthorizationRuleArgs $;

        public Builder() {
            $ = new QueueAuthorizationRuleArgs();
        }

        public Builder(QueueAuthorizationRuleArgs defaults) {
            $ = new QueueAuthorizationRuleArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param listen Does this Authorization Rule have Listen permissions to the ServiceBus Queue? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder listen(@Nullable Output<Boolean> listen) {
            $.listen = listen;
            return this;
        }

        /**
         * @param listen Does this Authorization Rule have Listen permissions to the ServiceBus Queue? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder listen(Boolean listen) {
            return listen(Output.of(listen));
        }

        /**
         * @param manage Does this Authorization Rule have Manage permissions to the ServiceBus Queue? When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder manage(@Nullable Output<Boolean> manage) {
            $.manage = manage;
            return this;
        }

        /**
         * @param manage Does this Authorization Rule have Manage permissions to the ServiceBus Queue? When this property is `true` - both `listen` and `send` must be too. Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder manage(Boolean manage) {
            return manage(Output.of(manage));
        }

        /**
         * @param name Specifies the name of the Authorization Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(@Nullable Output<String> name) {
            $.name = name;
            return this;
        }

        /**
         * @param name Specifies the name of the Authorization Rule. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder name(String name) {
            return name(Output.of(name));
        }

        /**
         * @param queueId Specifies the ID of the ServiceBus Queue. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder queueId(Output<String> queueId) {
            $.queueId = queueId;
            return this;
        }

        /**
         * @param queueId Specifies the ID of the ServiceBus Queue. Changing this forces a new resource to be created.
         * 
         * @return builder
         * 
         */
        public Builder queueId(String queueId) {
            return queueId(Output.of(queueId));
        }

        /**
         * @param send Does this Authorization Rule have Send permissions to the ServiceBus Queue? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder send(@Nullable Output<Boolean> send) {
            $.send = send;
            return this;
        }

        /**
         * @param send Does this Authorization Rule have Send permissions to the ServiceBus Queue? Defaults to `false`.
         * 
         * @return builder
         * 
         */
        public Builder send(Boolean send) {
            return send(Output.of(send));
        }

        public QueueAuthorizationRuleArgs build() {
            $.queueId = Objects.requireNonNull($.queueId, "expected parameter 'queueId' to be non-null");
            return $;
        }
    }

}
