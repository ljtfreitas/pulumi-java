// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.azurenative.webpubsub.inputs;

import io.pulumi.azurenative.webpubsub.inputs.EventHandlerTemplateArgs;
import io.pulumi.core.Input;
import io.pulumi.core.annotations.InputImport;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;


/**
 * The settings for event handler in webpubsub service
 * 
 */
public final class EventHandlerSettingsArgs extends io.pulumi.resources.ResourceArgs {

    public static final EventHandlerSettingsArgs Empty = new EventHandlerSettingsArgs();

    /**
     * Get or set the EventHandler items. The key is the hub name and the value is the corresponding EventHandlerTemplate.
     * 
     */
    @InputImport(name="items")
    private final @Nullable Input<Map<String,List<EventHandlerTemplateArgs>>> items;

    public Input<Map<String,List<EventHandlerTemplateArgs>>> getItems() {
        return this.items == null ? Input.empty() : this.items;
    }

    public EventHandlerSettingsArgs(@Nullable Input<Map<String,List<EventHandlerTemplateArgs>>> items) {
        this.items = items;
    }

    private EventHandlerSettingsArgs() {
        this.items = Input.empty();
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(EventHandlerSettingsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private @Nullable Input<Map<String,List<EventHandlerTemplateArgs>>> items;

        public Builder() {
    	      // Empty
        }

        public Builder(EventHandlerSettingsArgs defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.items = defaults.items;
        }

        public Builder setItems(@Nullable Input<Map<String,List<EventHandlerTemplateArgs>>> items) {
            this.items = items;
            return this;
        }

        public Builder setItems(@Nullable Map<String,List<EventHandlerTemplateArgs>> items) {
            this.items = Input.ofNullable(items);
            return this;
        }

        public EventHandlerSettingsArgs build() {
            return new EventHandlerSettingsArgs(items);
        }
    }
}
