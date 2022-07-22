// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.example;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import com.pulumi.example.BarResourceArgs;
import com.pulumi.example.Resource;
import com.pulumi.example.Utilities;
import java.util.Optional;
import javax.annotation.Nullable;

@ResourceType(type="bar::BarResource")
public class BarResource extends com.pulumi.resources.ComponentResource {
    @Export(name="foo", refs={Resource.class}, tree="[0]")
    private Output</* @Nullable */ Resource> foo;

    public Output<Optional<Resource>> foo() {
        return Codegen.optional(this.foo);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BarResource(String name) {
        this(name, BarResourceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BarResource(String name, @Nullable BarResourceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BarResource(String name, @Nullable BarResourceArgs args, @Nullable com.pulumi.resources.ComponentResourceOptions options) {
        super("bar::BarResource", name, args == null ? BarResourceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()), true);
    }

    private static com.pulumi.resources.ComponentResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.ComponentResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.ComponentResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.ComponentResourceOptions.merge(defaultOptions, options, id);
    }

}
