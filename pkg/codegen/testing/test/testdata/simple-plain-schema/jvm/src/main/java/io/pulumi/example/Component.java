// *** WARNING: this file was generated by test. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package io.pulumi.example;

import io.pulumi.core.Output;
import io.pulumi.core.annotations.Export;
import io.pulumi.core.annotations.ResourceType;
import io.pulumi.example.ComponentArgs;
import io.pulumi.example.Utilities;
import io.pulumi.example.outputs.Foo;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import javax.annotation.Nullable;

@ResourceType(type="example::Component")
public class Component extends io.pulumi.resources.ComponentResource {
    @Export(name="a", type=Boolean.class, parameters={})
    private Output<Boolean> a;

    public Output<Boolean> getA() {
        return this.a;
    }
    @Export(name="b", type=Boolean.class, parameters={})
    private Output</* @Nullable */ Boolean> b;

    public Output</* @Nullable */ Boolean> getB() {
        return this.b;
    }
    @Export(name="bar", type=Foo.class, parameters={})
    private Output</* @Nullable */ Foo> bar;

    public Output</* @Nullable */ Foo> getBar() {
        return this.bar;
    }
    @Export(name="baz", type=List.class, parameters={Foo.class})
    private Output</* @Nullable */ List<Foo>> baz;

    public Output</* @Nullable */ List<Foo>> getBaz() {
        return this.baz;
    }
    @Export(name="c", type=Integer.class, parameters={})
    private Output<Integer> c;

    public Output<Integer> getC() {
        return this.c;
    }
    @Export(name="d", type=Integer.class, parameters={})
    private Output</* @Nullable */ Integer> d;

    public Output</* @Nullable */ Integer> getD() {
        return this.d;
    }
    @Export(name="e", type=String.class, parameters={})
    private Output<String> e;

    public Output<String> getE() {
        return this.e;
    }
    @Export(name="f", type=String.class, parameters={})
    private Output</* @Nullable */ String> f;

    public Output</* @Nullable */ String> getF() {
        return this.f;
    }
    @Export(name="foo", type=Foo.class, parameters={})
    private Output</* @Nullable */ Foo> foo;

    public Output</* @Nullable */ Foo> getFoo() {
        return this.foo;
    }

    public interface BuilderApplicator {
        public void apply(ComponentArgs.Builder a);
    }
    private static io.pulumi.example.ComponentArgs buildArgs(BuilderApplicator argsBuilder) {
        final var builder = io.pulumi.example.ComponentArgs.builder();
        argsBuilder.apply(builder);
        return builder.build();
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param argsBuilder A function that configures a passed builder.
     */
    public Component(String name, BuilderApplicator argsBuilder) {
        this(name, buildArgs(argsBuilder), null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Component(String name) {
        this(name, ComponentArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Component(String name, ComponentArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Component(String name, ComponentArgs args, @Nullable io.pulumi.resources.ComponentResourceOptions options) {
        super("example::Component", name, args == null ? ComponentArgs.Empty : args, makeResourceOptions(options, Output.empty()), true);
    }

    private static io.pulumi.resources.ComponentResourceOptions makeResourceOptions(@Nullable io.pulumi.resources.ComponentResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = io.pulumi.resources.ComponentResourceOptions.builder()
            .setVersion(Utilities.getVersion())
            .build();
        return io.pulumi.resources.ComponentResourceOptions.merge(defaultOptions, options, id);
    }

}
